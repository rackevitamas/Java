import java.nio.charset.Charset;
import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy stringet: ");
        String egyString = scanner.nextLine();
        System.out.println("Kérek egyik karakter: ");
        String karakter1 = scanner.nextLine();
        System.out.println("Kérek másik karakter: ");
        String karakter2 = scanner.nextLine();
        System.out.println("Kérek egyik integer: ");
        Integer interger = scanner.nextInt();
        System.out.println("Kérek másik integer: ");
        Integer interger2 = scanner.nextInt();
        System.out.println("Kérek egyik double értéket: ");
        Double mDouble1 = scanner.nextDouble();
        System.out.println("Kérek másik double értéket: ");
        Double mDouble2 = scanner.nextDouble();
        System.out.println("A bekért string hozzáadása a karakterek " + egyString+karakter1+karakter2);
        System.out.println("A bekért számok osztás: " + interger + "/" +interger2 + "=" + interger/interger2);
        System.out.println("A bekért számok osztás: " + interger + "+" +interger2 + "=" + interger+interger2);
        System.out.println("A bekért számok kivonás: " + interger + "-" +mDouble1 + "=" + interger/mDouble1);
        System.out.println("A bekért számok szorzás: " + interger2 + "*" +mDouble2 + "=" + interger2*mDouble2);

    }
}
