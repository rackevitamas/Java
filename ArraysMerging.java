import java.util.Arrays;

public class ArraysMerging {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
        int[] arr2 = { 10, 324, 45, 90, 9808 };
        int ujl = arr.length + arr2.length;
        int[] ujtomb = new int[ujl];
        System.arraycopy(arr, 0, ujtomb, 0, arr.length);
        System.arraycopy(arr2, 0, ujtomb, arr.length, arr2.length);
        System.out.println(Arrays.toString(ujtomb));
    }
}
