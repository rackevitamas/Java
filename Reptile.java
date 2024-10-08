package zoo;

public class Reptile extends Animal {
    String breed;
    String sound;
    boolean isLandAnimal = false;

    public Reptile(String name, String breed, int age, boolean gender) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    @Override
    String breed(){
        return this.breed;
    }
    @Override
    void sound(){
        System.out.println(this.sound + " " + this.sound);
    }
    @Override
    boolean isLandAnimal(){
        return true;
    }
    @Override
    String getHabitat() {
        return "Szárazföld";
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public void setIsLandAnimal(boolean isLandAnimal){
        this.isLandAnimal = isLandAnimal;
    }
}
