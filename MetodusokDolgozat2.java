public class MetodusokDolgozat2 {
    public static int masodfokuMegoldasSzam(double a, double b, double c){
        double d = Math.pow(b, 2) - (4 * a * c);
        if (a == 0) {
            return -1;
        } else if (d < 0){
            return 0;
        } else if (d == 0){
            return 1;
        }else {
            return 2;
        } 
    }
    public static boolean vanKisbetu(String szoveg){
        for (Character betu: szoveg.toCharArray()){
            if (Character.isLowerCase(betu)) {
                return true;
            }
        }
        return false;
    }
    public static String getMeret(double a){
        if (a < 150) {
            return "XS";
        } else if(a < 160){
            return "S";
        } else if(a < 170){
            return "M";
        } else if(a < 180){
            return "L";
        } else if(a < 190){
            return "XL";
        } else {
            return "XXL";
        }
    }
    public static String rubikKockaSzin(int a){
        if (a == 1) {
            return "Yellow";
        } else if (a == 2){
            return "Red";
        } else if (a == 3){
            return "Orange";
        } else if (a == 4){
            return "White";
        } else if (a == 5){
            return "Blue";
        } else if (a == 6){
            return "Green";
        } else {
            return "invalid parameter";
        }
    }
    public static void main(String[] args) {
        System.out.println(masodfokuMegoldasSzam(0, 6, 5));
        System.out.println(masodfokuMegoldasSzam(0, 1, 1));
        System.out.println(masodfokuMegoldasSzam(1, 3, 4));
        System.out.println(masodfokuMegoldasSzam(2, 4, 3));
        System.out.println(masodfokuMegoldasSzam(2, -4, 2));
        System.out.println(masodfokuMegoldasSzam(1, -2, 1));
        System.out.println(masodfokuMegoldasSzam(1, 0, -4));
        System.out.println(masodfokuMegoldasSzam(2, 2, -2));
        System.out.println(vanKisbetu("alma"));
        System.out.println(vanKisbetu("ALmA"));
        System.out.println(vanKisbetu("ALMA"));
        System.out.println(vanKisbetu(""));
        System.out.println(vanKisbetu("123456"));
        System.out.println(getMeret(100));
        System.out.println(getMeret(150));
        System.out.println(getMeret(156));
        System.out.println(getMeret(160));
        System.out.println(getMeret(166));
        System.out.println(getMeret(170));
        System.out.println(getMeret(176));
        System.out.println(getMeret(180));
        System.out.println(getMeret(186));
        System.out.println(getMeret(190));
        System.out.println(getMeret(200));
        System.out.println(rubikKockaSzin(1));
        System.out.println(rubikKockaSzin(2));
        System.out.println(rubikKockaSzin(3));
        System.out.println(rubikKockaSzin(4));
        System.out.println(rubikKockaSzin(5));
        System.out.println(rubikKockaSzin(6));
        System.out.println(rubikKockaSzin(7));
        System.out.println(rubikKockaSzin(-1));
    }
}
