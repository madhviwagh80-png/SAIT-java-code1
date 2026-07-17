// Q7. WAP to demonstrate the concept of Multithreading

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String args[]) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

/*
Sample Output (thread interleaving may vary between runs)
Main Thread: 1
Thread is running: 1
Main Thread: 2
Thread is running: 2
Main Thread: 3
Thread is running: 3
Main Thread: 4
Thread is running: 4
Main Thread: 5
Thread is running: 5
*/
