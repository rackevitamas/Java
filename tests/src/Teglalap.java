public class Teglalap {
    public int addT (int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return a * b;
    }

    public int addK (int a, int b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException();
        }
        return 2 * (a + b);
    }

    public static void main(String[] args){
        Teglalap tg = new Teglalap();
        int a = 5;
        int b = 7;
        System.out.println("Az a oldal: " + a + " cm, b oldala: " + b + " cm, területe: " + tg.addT(a, b) + " cm2, kerülete: " + tg.addK(a, b) + " cm2.");
    }
}
