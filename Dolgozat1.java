import java.util.Scanner;
public class Dolgozat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a nevedet: ");
        String nev = sc.nextLine();
        System.out.println("Hello " + nev + "!");
        sc.close();
    }
}
