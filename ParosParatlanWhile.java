import java.util.Scanner;

public class ParosParatlanWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int szam;
        do {
            System.out.println("Kérem egy számot: ");
            szam = sc.nextInt();
        } while (szam < 0);
        if (szam % 2 == 0) {
            System.out.println("Páros");
        } else {
            System.out.println("Páratlan");
        }
        sc.close();
    }
}
