// Q11. WAP to Demonstrate Encapsulation Using Private Variable

class Student {
    private String name;
    private int age;

    public void setData(String n, int a) {
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class EncapsulationDemo {
    public static void main(String args[]) {
        Student s = new Student();
        s.setData("Madhvi", 21);
        s.display();
    }
}

/*
Output
Name: Madhvi
Age: 21
*/
