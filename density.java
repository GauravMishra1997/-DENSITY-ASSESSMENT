import java.util.Scanner;

public class DensityAssessment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Density Assessment Program");
        System.out.println("==========================");

        // Get mass input from the user
        System.out.print("Enter the mass (in grams): ");
        double mass = scanner.nextDouble();

        // Get volume input from the user
        System.out.print("Enter the volume (in cubic centimeters): ");
        double volume = scanner.nextDouble();
        
        scanner.close();

        // Calculate the density
        double density = calculateDensity(mass, volume);

        // Display the density
        System.out.println("The density is " + String.format("%.2f", density) + " g/cm^3");
    }

    // Function to calculate density
    public static double calculateDensity(double mass, double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume must be a positive number.");
        }
        return mass / volume;
    }
}
