package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts;
    private int ammoStorage;
    private int healthPoints;

    public Carrier(int healthPoints, int ammoStorage) {
        this.healthPoints = healthPoints;
        this.ammoStorage = ammoStorage;
        this.aircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() {
        if (ammoStorage <= 0) {
            throw new NullPointerException();
        }
        
        // Fill priority aircraft first
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.isPriority() && ammoStorage > 0) {
                ammoStorage -= aircraft.refillAmmo(ammoStorage);
            }
        }
        
        // Fill remaining aircrafts
        for (Aircraft aircraft : aircrafts) {
            if (ammoStorage > 0) {
                ammoStorage -= aircraft.refillAmmo(ammoStorage);
            }
        }
    }

    public void fight(Carrier enemyCarrier) {
        for (Aircraft aircraft : aircrafts) {
            int damage = aircraft.fight();
            enemyCarrier.healthPoints -= damage;
        }
    }

    public String getStatus() {
        if (healthPoints <= 0) {
            return "It's dead Jim :(";
        }

        StringBuilder status = new StringBuilder();
        status.append(String.format("HP: %d, Aircraft count: %d, Ammo Storage: %d, Total damage: %d\n",
                healthPoints, aircrafts.size(), ammoStorage, calculateTotalDamage()));
        
        status.append("Aircrafts:\n");
        for (Aircraft aircraft : aircrafts) {
            status.append(aircraft.getStatus()).append("\n");
        }

        return status.toString();
    }

    private int calculateTotalDamage() {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage += aircraft.ammo * aircraft.baseDamage;
        }
        return totalDamage;
    }
}
