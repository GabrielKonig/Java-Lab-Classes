public class MarsCalculator {
    public static void main(String[] args) {
        float earthWeightChirimumimba = 80.0f; // Replace with your weight on Earth

        // Mars gravity compared to Earth's gravity
        float marsGravity = 0.38f;

        // Calculate weight on Mars
        float weightOnMars = earthWeightChirimumimba * marsGravity;

        // Convert weight to double and limit to 4 decimal places
        double weightOnMarsDouble = Math.round(weightOnMars * 10000.0) / 10000.0;

        // Print the weight on Mars with 4 decimal places
        System.out.printf("Weight on Mars: %.4f\n", weightOnMarsDouble);

        // Convert double to int
        int weightOnMarsInt = (int) weightOnMarsDouble;

        // Display weight as integer
        System.out.println("Weight on Mars as a Int: " + weightOnMarsInt);

        // Display weight as Double
        System.out.println("Weight on Mars as a Double: " + weightOnMarsDouble);

        // Convert int to char
        char weightOnMarsChar = (char) weightOnMarsInt;

        // Display the weight as a character
        System.out.println("Weight on Mars as a character: " + weightOnMarsChar);
    }
}
