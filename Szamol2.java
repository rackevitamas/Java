import java.util.Scanner;
public class Szamol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int beolvas = sc.nextInt();
        for (int i = 1; i < 101; i++) {
            if (i % beolvas == 0) {
                System.out.println(i + " osztható szám");
            }
            if (beolvas * 10 == i) {
                System.out.println("Ez az utolsó szám");
                break;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
