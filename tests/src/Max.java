import java.util.Arrays;

public class Max {
    public int maxOfThree(int a, int b, int c){
        int[] number = new int[3];
        number[0] = a;
        number[1] = b;
        number[2] = c;
        int max = 0;
        for (int i = 0; i < number.length - 1; i++){
            if (max < number[i]){
                max = number[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Max maxChecker = new Max();
        System.out.println("A három szám közül legnagyobb: " + maxChecker.maxOfThree(5, 2, 3));
    }
}
