
public class PrintCubes {
    public static void main(String[] args) {
        System.out.println("Cubes of numbers from 1 to 15:");
        
        // Loop from 1 to 15
        for (int i = 1; i <= 15; i++) {
            // Calculate the cube by multiplying the number three times
            int cube = i * i * i;
            
            System.out.println("Cube of " + i + " = " + cube);
        }
    }
}
