import java.util.Scanner;;
public class Tomb3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem egy számot ami végére ér: ");
        int veges = sc.nextInt();
        String[] tomb = new String[veges];
        for (int i = 0; i < tomb.length; i++) {
            System.out.print("Kérem a szavat amibe majd rakom a tömbbe: ");
            String szo = sc.next();
            tomb[i] = szo;
        }
        System.out.println("Ezek voltak a tömbben: ");
        for (String i : tomb) {
            System.out.println(i);
        }
        sc.close();
    }
}
