public class Teglalap {
    public int terulet(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Az oldalhosszaknak pozitívnak kell lenniük!");
        }
        return a * b;
    }

    public int kerulet(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Az oldalhosszaknak pozitívnak kell lenniük!");
        }
        return 2 * (a + b);
    }

    public static void main(String[] args) {
        Teglalap tg = new Teglalap();
        int a = 5;
        int b = 7;
        System.out.println("Az a oldal: " + a + " cm, b oldala: " + b + " cm, területe: " + tg.terulet(a, b) + " cm2, kerülete: " + tg.kerulet(a, b) + " cm.");
    }
}
