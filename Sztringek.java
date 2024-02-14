import java.util.Scanner;
public class Sztringek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a vezetéknevedet: ");
        String vezetn = sc.nextLine();
        System.out.println("Kérem a keresztnevedet: ");
        String keresztn = sc.nextLine();
        System.out.println("Kérem a születési helyedet: ");
        String szulhely = sc.nextLine();
        System.out.println("Kérem az életkorod: ");
        int kor = sc.nextInt();
        String fullName = vezetn.concat(" " + keresztn);
        System.out.println("A nagybetűs név: " + fullName.toUpperCase());
        System.out.println("A teljes névben indexe a keresztnevet: " + fullName.indexOf(keresztn));
        System.out.println("A kisbetűs név és születési hely: " + fullName.toLowerCase() + " " + szulhely.toLowerCase());
        System.out.println("Adatai: " + kor + " éves, " + fullName + ", " + szulhely + ".");
        System.out.println("A keresztnév A első betűje: " + keresztn.startsWith("A"));
        System.out.println("A vezetéknév t utolsó betűje: " + vezetn.endsWith("t"));
        System.out.println("A teljes név hossza: " + fullName.length());
        System.out.println("A teljes név összes i betűje cserélődik az y-ra: " + fullName.replaceAll("i", "y"));
        sc.close();
    }
}