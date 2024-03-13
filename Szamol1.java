import java.util.Scanner;

public class Szamol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int beolvas = sc.nextInt();
        for (int i = 1; i < 101; i++) {
            if (i % beolvas == 0) {
                continue;
            }
            if (beolvas * 10 == i) {
                break;
            }
            System.out.println(i);
        }
        sc.close();
    }
}
