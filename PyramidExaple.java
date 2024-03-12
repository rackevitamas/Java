public class PyramidExaple {
    public static void main(String[] args) {
        int szamlalo = 2;
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < szamlalo; j++) {
                if (szamlalo > 6) {
                    break;
                } 
                System.out.print("*");
            }
            szamlalo++;
            System.out.println();
        }
    }
}
