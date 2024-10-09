
package Flyable;

import Animal.zoo.Bird;


public class Main {
    public static void main(String[] args) {
        Helicopter h = new Helicopter("Apache AC-126", 450, false);
        Helicopter th = new Helicopter("Monster A1", 220, true);

        System.out.println(h);
        h.setLand(true);
        System.out.println(h.fly());

        Bird madar = new Bird("Kele", "gólya", 1);
        System.out.println(madar);

    }
}
