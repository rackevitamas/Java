import java.util.Scanner;
public class IFfeladat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int szam1 = sc.nextInt();
        System.out.println("Kérem a második számot: ");
        int szam2 = sc.nextInt();
        String erdem = (szam1 > szam2) ?"Az első szám nagyobb": (szam1 < szam2) ? "A második nagyobb":"A két szám egyenlő";
        System.out.println(erdem);
        sc.close();
    }
}
