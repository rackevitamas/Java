import java.util.Scanner;
public class Dolgozat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem egész számot az 2 és 9 között: ");
        int szam = sc.nextInt();
        sc.close();
        switch (szam) {
            case 2:
                System.out.println("Prím szám.");
                break;
            case 3:
                System.out.println("Prím szám.");
                break;
            case 4:
                System.out.println("Nem prím szám.");
                System.out.println("Kettővel osztható.");
                break;
            case 5:
                System.out.println("Prím szám.");
                break;
            case 6:
                System.out.println("Nem prím szám.");
                System.out.println("Kettővel osztható.");
                break;
            case 7:
                System.out.println("Prím szám.");
                break;
            case 8:
                System.out.println("Nem prím szám.");
                System.out.println("Kettővel és néggyel osztható.");
                break;
            case 9:
                System.out.println("Nem prím szám.");
                System.out.println("Hárommal osztható.");
                break;
            default:
                System.out.println("Téves a szám!");
                break;
        }
    }
}
