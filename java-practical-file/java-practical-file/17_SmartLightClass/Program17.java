// Program 17
// Question: Create a class SmartLight that manages brightness levels.

class SmartLight {
    int brightnessLevel = 50;

    void changeBrightness(int newLevel) {
        if (newLevel >= 0 && newLevel <= 100) {
            brightnessLevel = newLevel;
            System.out.println("Brightness adjusted to: " + brightnessLevel + "%");
        } else {
            System.out.println("Invalid setting! Please choose a value between 0 and 100.");
        }
    }
}

public class Program17 {
    public static void main(String[] args) {
        SmartLight livingRoomLight = new SmartLight();
        System.out.println("Initial Level: " + livingRoomLight.brightnessLevel + "%");
        livingRoomLight.changeBrightness(85);
        livingRoomLight.changeBrightness(120);
    }
}

/*
Output:
Initial Level: 50%
Brightness adjusted to: 85%
Invalid setting! Please choose a value between 0 and 100.
*/
