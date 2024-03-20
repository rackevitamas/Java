public class ArrayFizzBuzz {
    public static void main(String[] args) {
        int[] tomb = new int[100];
        int k = 1;
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = k;
            k++;
        }
        String[] ujtomb = new String[100];
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i] % 5 == 0 && tomb[i] % 3 == 0) {
                ujtomb[i] = "FizzBuzz";
            } else if (tomb[i] % 5 == 0) {
                ujtomb[i] = "Fizz";
            } else if (tomb[i] % 3 == 0){
                ujtomb[i] = "Buzz";
            } else {
                ujtomb[i] = "" + tomb[i];
            }
        }
        int o = 0;
        for (int i = 0; i < ujtomb.length; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(ujtomb[o] + ", ");
                o++;
            }
            System.out.println();
        }
    }
}
