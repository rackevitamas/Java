import java.util.Scanner;
public class Tomb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem egy számot ami végére ér: ");
        int veges = sc.nextInt();
        double[] tomb = new double[veges];
        for (int i = 0; i < tomb.length; i++) {
            System.out.print("Kérem a számot amibe majd rakom a tömbbe: ");
            double szam = sc.nextDouble();
            tomb[i] = szam;
        }
        System.out.println("Ezek voltak a tömbben: ");
        for (double i : tomb) {
            System.out.println(i);
        }
        sc.close();
    }
}
