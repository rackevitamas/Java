package aircraftCarrier;

abstract class Aircraft {
    protected int ammo;
    protected final int maxAmmo;
    protected final int baseDamage;

    public Aircraft(int maxAmmo, int baseDamage) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
        this.ammo = 0;
    }

    public int fight() {
        int damage = ammo * baseDamage;
        ammo = 0; // All ammo is used
        return damage;
    }

    public int refillAmmo(int ammo) {
        int ammoToFill = Math.min(ammo, maxAmmo - this.ammo);
        this.ammo += ammoToFill;
        return ammo - ammoToFill; // Return remaining ammo
    }

    public abstract String getType();

    public String getStatus() {
        return String.format("Type %s, Ammo: %d, Base Damage: %d, All Damage: %d",
                getType(), ammo, baseDamage, ammo * baseDamage);
    }

    public abstract boolean isPriority();
}
