import javax.security.auth.x500.X500Principal;

public class MetodusokDolgozat {
    public int signOfTheNumber(int a) {
        if (a > 0) {
            return 1;
        } else if(a == 0){
            return 0;
        } else{
            return -1;
        }
    }
    public String twoParameters(String a, int b) {
        return a + ", " + b;
    }
    public double triangleArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        double t = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
        boolean haromszog = false;
        if (a == 0 || b == 0 || c == 0) {
            haromszog = false;
        } else if (a == b && a == c) {
            haromszog = true;
        } else if (a == b ) {
            haromszog = true;
        } else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2) || Math.pow(c, 2) + Math.pow(b, 2) == Math.pow(a, 2)){
            haromszog = true;
        }
        if (haromszog) {
            return /*"triangleArea" + "(" + a + ", " + b + ", " + c + ") -> " + */t;
        } else{
            return "Nem háromszög";
        }
    }
    public double secondDegreeFunction(double a, double b, double c){
        double mf = a * Math.pow(x, 2) + b * x + c;
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        if (x1 > 0 && x2 > 0) {
            return "x1 = " + x1 + "x2 = " + x2;
        } else if (x1 > 0){
            return "nem masodfoku a fuggveny"
        } else if(x1 < 0 && x2 < 0){
            return "nincs valo megoldas"
        }
    }
    public static void main(String[] args) {
        
    }
}
