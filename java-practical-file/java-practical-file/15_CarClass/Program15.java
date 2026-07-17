// Program 15
// Question: Create a Car class that tracks speed and fuel level.

class Car {
    int speed;
    int fuelLevel;

    Car(int s, int f) {
        speed = s;
        fuelLevel = f;
    }

    void trackingDashboard() {
        System.out.println("--- Car Dashboard ---");
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}

public class Program15 {
    public static void main(String[] args) {
        Car myCar = new Car(80, 65);
        myCar.trackingDashboard();
    }
}

/*
Output:
--- Car Dashboard ---
Current Speed: 80 km/h
Fuel Level: 65%
*/
