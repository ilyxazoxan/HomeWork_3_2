public class GeometricProgression {
    public static void main(String[] args) {
        int Degree = 2;
        int beginning = 1;
        int theAmount = beginning;

        do {
            System.out.println("theAmount = " + theAmount);
            theAmount = (beginning + (theAmount * Degree));

        } while (theAmount <= 100);
    }
}
