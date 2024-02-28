import java.util.Scanner;
public class Dolgozat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az egész számot: ");
        int sugar = sc.nextInt();
        sc.close();
        double terulet = Math.ceil(Math.pow(sugar, 2) * Math.PI);
        int terulet2 = (int) terulet;
        System.out.println("A kör területe: " + terulet2);
    }
}
