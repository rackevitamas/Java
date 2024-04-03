import java.util.Arrays;

public class ArrayToString {
    public static String convertToString(int[] array) {
        return Arrays.toString(array);
    }

    public static String convertToString(double[] array) {
        return Arrays.toString(array);
    }

    public static String convertToString(boolean[] array) {
        return Arrays.toString(array);
    }

    public static String convertToString(String[] array) {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        boolean[] booleanArray = {true, false, true, false};
        String[] stringArray = {"apple", "banana", "orange"};

        System.out.println("Int array: " + convertToString(intArray));
        System.out.println("Double array: " + convertToString(doubleArray));
        System.out.println("Boolean array: " + convertToString(booleanArray));
        System.out.println("String array: " + convertToString(stringArray));
    }
}
