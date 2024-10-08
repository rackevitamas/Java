package zoo;

public abstract class Animal{
    String name;
    int age;
    boolean gender;

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean getGender() {
        return this.gender;
    }

    abstract String breed();

    abstract void sound();

    abstract boolean isLandAnimal();

    abstract String getHabitat();
    
    
}