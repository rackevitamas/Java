import java.util.Scanner;

public class Operators2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy stringet: ");
        String myString = sc.nextLine();
        System.out.print("Kérek egy karakter: ");
        char myChar1 = sc.next().charAt(0);
        System.out.print("Kérek másik karakter: ");
        char myChar2 = sc.next().charAt(0);
        System.out.print("Kérek egy egész szám: ");
        Integer myInt1 = sc.nextInt();
        System.out.print("Kérek másik egész szám: ");
        Integer myInt2 = sc.nextInt();
        System.out.print("Kérek egy tizedes szám: ");
        Double myDouble1 = sc.nextDouble();
        System.out.print("Kérek másik tizedes szám: ");
        Double myDouble2 = sc.nextDouble();
        System.out.println("A bekért string hozzáadása a karakterek " + myString + myChar1 + myChar2);
        System.out.println("A bekért számok osztás: " + myInt1 + " / " + myInt2 + " = B" + (myInt1 / myInt2));
        System.out.println("A bekért számok osztás: " + myInt1 + " + " + myInt2 + " = " + (myInt1 + myInt2));
        System.out.println("A bekért számok kivonás: " + myInt1 + " - " + myDouble1 + " = " + (myInt1 / myDouble1));
        System.out.println("A bekért számok szorzás: " + myInt2 + " * " + myDouble2 + " = " + (myInt2 * myDouble2));
        sc.close();
    }
}