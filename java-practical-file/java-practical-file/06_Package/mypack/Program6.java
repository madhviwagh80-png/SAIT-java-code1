// Program 6
// Question: Write a Java program to demonstrate the concept of package.

package mypack;

public class Program6 {
    public void msg() {
        System.out.println("Hello from inside the mypack package!");
    }

    public static void main(String[] args) {
        Program6 obj = new Program6();
        obj.msg();
    }
}

/*
Output:
Hello from inside the mypack package!

Compile & run (from the 06_Package folder):
  javac mypack/Program6.java
  java mypack.Program6
*/
