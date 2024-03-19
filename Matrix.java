import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a kétdimemziós mátrix x méretet: ");
        int sor = sc.nextInt();
        System.out.print("Kérem a kétdimemziós mátrix y méretet: ");
        int oszlop = sc.nextInt();
        sc.close();
        int[][] ketd = new int[sor][oszlop];
        int szam = 1;
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                ketd[i][j] = szam;
            }
        }
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.print(ketd[i][j]);
            }
            System.out.println();
        }
    }
}
