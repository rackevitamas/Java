import java.util.Scanner;
public class Szamol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int beolvas = sc.nextInt();
        System.out.print("Kérem a másik számot: ");
        int beolvas2 = sc.nextInt();
        for (int i = 2; i < 101; i++) {
            if (beolvas % i == 0 && beolvas2 % i == 0) {
                System.out.println("FizzBuzz");
            } else if (beolvas % i == 0) {
                System.out.println("Fizz");
            } else if (beolvas2 % i == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                continue;
            } else {
                System.out.println("Egyik sem osztható: " + i);
            }
            System.out.println(i);
        }
        sc.close();
    }
}
