public class MasodfokuHiba {
    private static int masodfokuMegoldasSzam(double a, double b, double c){
        double d = Math.pow(b, 2) - (4 * a * c);
        if (a == 0) {
            throw new IllegalArgumentException("Első paraméter nem lehet nulla!");
        } else if (d < 0){
            throw new IllegalArgumentException("Nem másodfokú egyenlet!");
        } else if (d == 0){
            throw new IllegalArgumentException("Hibakezelés szükséges!");
        }else {
            return 2;
        } 
    }
    private static String masodfokuGyokok(double a, double b, double c){
        double d = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + d) / 2 * a;
        double x2 = (-b - d) / 2 * a;
        if (a == 0) {
            throw new IllegalArgumentException("Első paraméter nem lehet nulla!");
        } else if (d < 0){
            throw new IllegalArgumentException("Nem másodfokú egyenlet!");
        } else if (d == 0){
            throw new IllegalArgumentException("Hibakezelés szükséges!");
        }else if(d > 0) {
            if (x1 == x2) {
                throw new IllegalArgumentException("A két zérushely megegyezik.");
            }
            else{
                return "Két különbözö megoldás";
            }
        }
        return "-.-";
    }
    public static void main(String[] args) {
        System.out.println(masodfokuGyokok(2, 2, -2));
    }
}
