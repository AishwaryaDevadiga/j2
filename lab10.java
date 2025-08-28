class NaturalNumbers extends Thread {
    public void run() {
        System.out.println("Thread 1 - Natural Numbers (1 to 100):");
        for (int i = 1; i <= 100; i++) System.out.print(i + " ");
        System.out.println("\nThread 1 Completed.\n");
    }
}

class EvenNumbers extends Thread {
    public void run() {
        System.out.println("Thread 2 - Even Numbers (2 to 100):");
        for (int i = 2; i <= 100; i += 2) System.out.print(i + " ");
        System.out.println("\nThread 2 Completed.\n");
    }
}

class OddNumbers extends Thread {
    public void run() {
        System.out.println("Thread 3 - Odd Numbers (1 to 99):");
        for (int i = 1; i < 100; i += 2) System.out.print(i + " ");
        System.out.println("\nThread 3 Completed.\n");
    }
}

public class lab10 {
    public static void main(String[] args) {
        NaturalNumbers t1 = new NaturalNumbers();
        EvenNumbers t2 = new EvenNumbers();
        OddNumbers t3 = new OddNumbers();

        // set priorities
        t2.setPriority(Thread.MAX_PRIORITY);  
        t3.setPriority(Thread.NORM_PRIORITY); 
        t1.setPriority(Thread.MIN_PRIORITY);  

        try {
            t2.start(); t2.join();  // Even first
            t3.start(); t3.join();  // Odd next
            t1.start();             // Natural last
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
