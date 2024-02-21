import java.util.Scanner;
public class IFfeladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a magasságod: ");
        int magas = sc.nextInt();
        String result = (magas > 150 && magas < 166) ? "Méreted: S" : (magas > 165 && magas < 176) ? "Méreted: M" : (magas > 175 && magas < 186) ? "Méreted: L" : (magas > 185 && magas < 196) ? "Méreted: XL":"NO SIZE";
        System.out.println(result);
        sc.close();
    }
}
