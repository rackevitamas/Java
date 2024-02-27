import java.util.Scanner;
public class Szogek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem adjon meg szöget: ");
        int szog = sc.nextInt();
        int seged = 0;
        if (szog == 0) {
            seged = 0;
        }else if (szog > 0 && szog < 61) {
            seged = 2;
        }else if (szog == 90) {
            seged = 90;
        }else if (szog > 60 && szog < 180) {
            seged = 3;
        }else  if (szog == 180) {
            seged = 180;
        } else if (szog > 180 && szog < 360) {
            seged = 4;
        }else if (szog == 360) {
            seged = 360;
        } else  {
            seged = -1;
        }
        switch (seged) {
            case 0:
                System.out.println("Null szög.");
                break;
            case 2:
                System.out.println("Hegyes szög.");
                break;
            case 90:
                System.out.println("Derékszög.");
                break;
            case 3:
                System.out.println("Tompa szög.");
                break;
            case 180:
                System.out.println("Egyenes szög.");
                break;
            case 4:
                System.out.println("Homorú szög.");
                break;
            case 360:
                System.out.println("Teljes szög.");
                break;
            default:
                System.out.println("Nem jól írtál be!");
                break;
        }
        sc.close();
    }
}
