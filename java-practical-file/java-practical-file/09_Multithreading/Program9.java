// Program 9
// Question: Write a Java program to demonstrate the concept of multithreading.

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running: Value " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Program9 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Thread-A");
        t2.setName("Thread-B");
        t1.start();
        t2.start();
    }
}

/*
Output:
Thread-A is running: Value 1
Thread-B is running: Value 1
Thread-A is running: Value 2
Thread-B is running: Value 2
Thread-A is running: Value 3
Thread-B is running: Value 3

(Actual interleaving may vary between runs since thread scheduling isn't deterministic.)
*/
