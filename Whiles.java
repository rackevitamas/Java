public class Whiles {
    public static void main(String[] args) {
        int a = (int)Math.ceil(Math.random() * 99);
        int b = (int)Math.ceil(Math.random() * 99);
        int i = 0;
        while (a < b) {
            if (i < 10) {
                System.out.print(a++ + ", ");
                i++;
            }else {
                System.out.print("\n");
                i = 0;
            }
        }
        System.out.println("");
        i = 0;
        int c = (int)Math.ceil(Math.random() * 99);
        int d = (int)Math.ceil(Math.random() * 99);
        do {
            if (i < 10) {
                System.out.print(c++ + ", ");
                i++;
            }else {
                System.out.print("\n");
                i = 0;
            }
        } while (c < d);
    }
}