import java.util.Scanner;
public class Tomb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem egy számot ami végére ér: ");
        int veges = sc.nextInt();
        int[] tomb = new int[veges];
        for (int i = 0; i < tomb.length; i++) {
            System.out.print("Kérem a számot amibe majd rakom a tömbbe: ");
            int szam = sc.nextInt();
            tomb[i] = szam;
        }
        System.out.println("Ezek voltak a tömbben: ");
        for (int i : tomb) {
            System.out.println(i);
        }
        sc.close();
    }
}