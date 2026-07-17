// Program 4
// Question: Write a Java program demonstrating constructor overloading for calculating box volume.

class Box {
    double width, height, depth;

    // Constructor when all dimensions are specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Overloaded Constructor for a cube
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Box myBox = new Box(5, 4, 3);
        Box myCube = new Box(4);
        System.out.println("Volume of Box: " + myBox.volume());
        System.out.println("Volume of Cube: " + myCube.volume());
    }
}

/*
Output:
Volume of Box: 60.0
Volume of Cube: 64.0
*/
