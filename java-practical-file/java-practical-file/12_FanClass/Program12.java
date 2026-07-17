// Program 12
// Question: Define a class Fan with attributes speed and isOn. Write a method to display the current
// status. Create two objects of this class.

class Fan {
    int speed;
    boolean ison;

    Fan(int speed, boolean ison) {
        this.speed = speed;
        this.ison = ison;
    }

    void displayStatus() {
        if (ison) {
            System.out.println("Fan is ON at a speed of: " + speed);
        } else {
            System.out.println("Fan is OFF.");
        }
    }
}

public class Program12 {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true);
        Fan fan2 = new Fan(0, false);
        System.out.print("Fan 1 Status: ");
        fan1.displayStatus();
        System.out.print("Fan 2 Status: ");
        fan2.displayStatus();
    }
}

/*
Output:
Fan 1 Status: Fan is ON at a speed of: 3
Fan 2 Status: Fan is OFF.
*/
