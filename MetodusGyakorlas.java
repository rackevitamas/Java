public class MetodusGyakorlas {

    public static double negyzetTerulet(double a, double b){
        if (a == 0 || b == 0) {
            return 0;
        }
        else if(a < 0 || b < 0){
            return -1;
        }
        else{
            return a * b;
        }
    }
    public static int harmadikSzog(int a, int b){
        int c = 180 - (a + b);
        if (a == 0 || b == 0) {
            return -1;
        }
        else if(a < 0 || b < 0){
            return -1;
        }
        else if(a + b + c == 180){
            return c;
        }
        else{
            return -1;
        }
    }
    public static boolean vanNagybetu(String szoveg){
        for (Character betu : szoveg.toCharArray()){
            if (Character.isUpperCase(betu)) {
                return true;
            }
        }
        return false;
    }
    public static String fejVagyiras(int a){
        if (a > 0) {
            return "fej";
        } else if(a < 0){
            return "iras";
        }else{
            return "élére esett";
        }
    }
    public static void main(String[] args) {
        System.out.println(harmadikSzog(-50, 50));
        System.out.println(vanNagybetu("Szoveg"));
        System.out.println(fejVagyiras(-1));
    }
}