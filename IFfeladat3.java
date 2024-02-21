import java.util.Scanner;
public class IFfeladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem az első egész számot: ");
        int szam1 = sc.nextInt();
        System.out.println("Kérem a második egész számot: ");
        int szam2 = sc.nextInt();
        System.out.println("Kérem a harmadik egész számot: ");
        int szam3 = sc.nextInt();
        String result = (szam1 > szam2 && szam1 > szam3 && szam2 > szam3) ? "Az első nagyobb: " + szam1 + ",\na második középső: " + szam2 + ",\na harmadik legkisebb: " + szam3 : (szam1 > szam2 && szam1 > szam3 && szam2 < szam3) ? "Az első nagyobb: " + szam1 + ",\na második középső: " + szam3 + ",\na harmadik legkisebb: " + szam2 : (szam2 > szam1 && szam2 > szam3 && szam1 > szam3) ? "Az első nagyobb: " + szam2 + ",\na második középső: " + szam1 + ",\na harmadik legkisebb: " + szam3 : (szam2 > szam1 && szam2 > szam3 && szam1 < szam3) ? "Az első nagyobb: " + szam2 + ",\na második középső: " + szam3 + ",\na harmadik legkisebb: " + szam1 : (szam3 > szam1 && szam3 > szam2 && szam1 > szam2) ? "Az első nagyobb: " + szam3 + ",\na második középső: " + szam1 + ",\na harmadik legkisebb: " + szam2 : (szam3 > szam1 && szam3 > szam2 && szam1 < szam2) ? "Az első nagyobb: " + szam3 + ",\na második középső: " + szam2 + ",\na harmadik legkisebb: " + szam1 + "." : "Értelmezetlen";
        System.out.println(result);
        sc.close();
    }
}
