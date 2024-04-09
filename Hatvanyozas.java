import java.util.Scanner;
public class Hatvanyozas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az egész számot: ");
        double a = sc.nextDouble();
        System.out.print("Kérem az egész számot: ");
        double b = sc.nextDouble();
        double result = hatvany(a, b);
        System.out.println(result);
        sc.close();
    }
    public static double hatvany(double a, double b){
        if (b < 1) {
            return 1;
        }
            return (a * hatvany(a, b - 1));
    }
}
