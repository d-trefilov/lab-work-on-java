package lr12;

import java.util.Random;

public class Example6 {

    // Класс для суммирования части массива
    static class SumCalculator extends Thread {
        private int[] array;
        private int start;
        private int end;
        private long sum;

        public SumCalculator(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
            this.sum = 0;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
        }

        public long getSum() {
            return sum;
        }
    }

    public static long sumParallel(int[] array) throws InterruptedException {
        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Количество ядер процессора: " + numThreads);

        return sumParallel(array, numThreads);
    }

    public static long sumParallel(int[] array, int numThreads) throws InterruptedException {
        if (array == null || array.length == 0) {
            return 0;
        }

        // Создаем массив для хранения результатов
        SumCalculator[] calculators = new SumCalculator[numThreads];

        // Определяем размер части для каждого потока
        int chunkSize = array.length / numThreads;

        // Создаем и запускаем потоки
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * chunkSize;

            calculators[i] = new SumCalculator(array, start, end);
            calculators[i].start();
        }

        // Ожидаем завершения всех потоков и суммируем результаты
        long totalSum = 0;
        for (SumCalculator calculator : calculators) {
            calculator.join();
            totalSum += calculator.getSum();
        }

        return totalSum;
    }

    // Однопоточная версия для сравнения
    public static long sumSequential(int[] array) {
        long sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        // Создаем тестовый массив
        int size = 100_000_000;
        int[] array = new int[size];
        Random random = new Random();

        System.out.println("Заполнение массива из " + size + " элементов...");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        // Однопоточное суммирование
        long startTime = System.currentTimeMillis();
        long sequentialSum = sumSequential(array);
        long sequentialTime = System.currentTimeMillis() - startTime;

        // Многопоточное суммирование
        startTime = System.currentTimeMillis();
        long parallelSum = sumParallel(array);
        long parallelTime = System.currentTimeMillis() - startTime;

        // Вывод результатов
        System.out.println("\n=== РЕЗУЛЬТАТЫ ===");
        System.out.println("Сумма (однопоточно): " + sequentialSum);
        System.out.println("Сумма (многопоточно): " + parallelSum);
        System.out.println("Время (однопоточно): " + sequentialTime + " мс");
        System.out.println("Время (многопоточно): " + parallelTime + " мс");
        System.out.println("Ускорение: " + String.format("%.2f", (double) sequentialTime / parallelTime) + "x");

        // Проверка корректности
        if (sequentialSum == parallelSum) {
            System.out.println("✓ Результаты совпадают!");
        } else {
            System.out.println("✗ Ошибка: результаты не совпадают! Разница: " + (sequentialSum - parallelSum));
        }
    }
}
