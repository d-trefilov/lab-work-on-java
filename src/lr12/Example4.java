package lr12;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        // Создание и запуск потоков
        for (int i = 0; i < 10; i++) {
            final int threadNumber = i + 1;
            threads[i] = new Thread(() -> {
                System.out.println("Поток " + threadNumber);
            });
            threads[i].start();
        }

        // Ожидание завершения всех потоков
        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Все потоки завершили работу");
    }
}