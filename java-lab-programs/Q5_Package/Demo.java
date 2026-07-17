// Q5. WAP to demonstrate Package Concept
// File 2: Demo.java

import mypackage.Message;

class Demo {
    public static void main(String args[]) {
        Message obj = new Message();
        obj.show();
    }
}

/*
Output
Welcome to Java Package

Compile & run:
  javac mypackage/Message.java
  javac -cp . Demo.java
  java -cp . Demo
*/
