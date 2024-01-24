import java.util.Scanner;
public class Soutln {
    public static void main(String[] args) {
        String msg = "I'm happy today.";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;
        System.out.println(msg);
        System.out.println(a);
        System.out.println(o);
        System.out.println(h);
        System.out.println(d);
        System.out.println("Kérem a nevedet: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Kérem a zeneszám kedvenced: ");
        Scanner zeneolvas = new Scanner(System.in);
        String zene = zeneolvas.nextLine();
        System.out.println("Kedvenc zeneszámod: " + zene + "!");
        System.out.println("Kérem a kedvenc ételed: ");
        Scanner etelolvas = new Scanner(System.in);
        String etel = etelolvas.nextLine();
        System.out.println("Kedvenc ételed: " + etel + "!");
        System.out.println("Kérem a hobbi: ");
        Scanner hobbiolvas = new Scanner(System.in);
        String hobbi = hobbiolvas.nextLine();
        System.out.println("Hobbid: " + hobbi + "!");
        System.out.println("Kérem a film kedvenced: ");
        Scanner filmolvas = new Scanner(System.in);
        String film = zeneolvas.nextLine();
        System.out.println("Kedvenc filmed: " + film + "!");
        System.out.println("Kérem az úticélod: ");
        Scanner utolvas = new Scanner(System.in);
        String ut = zeneolvas.nextLine();
        System.out.println("Úticélod: " + ut + "!");
    }
}
