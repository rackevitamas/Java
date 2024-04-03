public class SumANumberAndAnArray {

    
    public static int sum(int number, int[] array) {
        int sum = number;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    
    public static double sum(double number, double[] array) {
        double sum = number;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        int intNumber = 10;
        double doubleNumber = 10.5;

        
        System.out.println("Összeg (int szám és int tömb): " + sum(intNumber, intArray));
        System.out.println("Összeg (double szám és double tömb): " + sum(doubleNumber, doubleArray));
    }
}
