package lr12;

public class Example5 {

    static class MaxFinder extends Thread {
        private int[] array;
        private int start;
        private int end;
        private int max;

        public MaxFinder(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        public void run() {
            max = array[start];
            for (int i = start + 1; i < end; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        public int getMax() {
            return max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {3, 7, 2, 9, 1, 8, 5, 6, 4, 10};

        int numThreads = Runtime.getRuntime().availableProcessors();
        System.out.println("Массив: " + java.util.Arrays.toString(numbers));
        System.out.println("Количество потоков (по числу ядер): " + numThreads);

        // Создаем потоки
        MaxFinder[] finders = new MaxFinder[numThreads];
        int chunkSize = numbers.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? numbers.length : (i + 1) * chunkSize;
            finders[i] = new MaxFinder(numbers, start, end);
            finders[i].start();
        }

        // Ждем завершения всех потоков
        int globalMax = Integer.MIN_VALUE;
        for (MaxFinder finder : finders) {
            finder.join();
            if (finder.getMax() > globalMax) {
                globalMax = finder.getMax();
            }
        }

        System.out.println("Максимальный элемент: " + globalMax);
    }
}