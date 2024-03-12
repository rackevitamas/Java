public class PyramidReversed {
    public static void main(String[] args) {
        int szamlalo = 5;
        for (int i = 5; i > 0; i--) {
            for (int j = 6; j > szamlalo; j--) {
                if (szamlalo < 0) {
                    break;
                }
                System.out.print("*");
            }
            szamlalo--;
            System.out.println();
        }
    }
}
