import java.util.Scanner;
public class FaktoralisRekurzio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egész számot: ");
        int be = sc.nextInt();
        int result = add(be);
        sc.close();
        int i;
        for (i = 1; i < be; i++) {
            System.out.print(i + " * ");
        }
        System.out.println(i + " = " + result);
    }
    public static int add(int a) {
        if (a < 1) {
            return 1;
        }
            return a * add(a - 1);
    }
}