package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runable);
        Thread thread2 = new Thread(runable);
        Thread thread3 = new Thread(runable);
        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImpl2 implements Runnable {
    private void doWork2() {
        System.out.println("Ura!");
    }

    public void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            doWork1();
        }
    }
}

