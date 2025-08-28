class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadOne: " + i);
        }
    }
}

class ThreadTwo implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("ThreadTwo: " + i);
        }
    }
}

public class lab9 {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();          // Thread using Thread class
        Thread t2 = new Thread(new ThreadTwo()); // Thread using Runnable

        t1.start();
        t2.start();
    }
}
