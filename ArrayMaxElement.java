public class ArrayMaxElement {
    public static void main(String[] args) {
        int[] tomb = {12, 45, 67, 89, 100, 23, 3456, 897, 452, 899, 700};
        int max = 0;
        for (int i = 0; i < tomb.length; i++) {
            if (max < tomb[i]) {
                max = tomb[i];
            }
        }
        System.out.println("A tömbben a legnagyobb eleme: " + max);
    }
}
