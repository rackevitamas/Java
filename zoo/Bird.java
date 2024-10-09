package zoo;

public class Bird implements Repulo, Novenyevo, Ragadozo {
    String breed;
    String sound;
    boolean isLandAnimal = false;

    public Bird(String name, String breed, int age, boolean gender){
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
        return false;
    }
    @Override
    String getHabitat() {
        return "Levegő";
    }

    public void setSound(String sound){
        this.sound = sound;
    }

    public void setIsLandAnimal(boolean isLandAnimal){
        this.isLandAnimal = isLandAnimal;
    }

    @Override
    public void repul() {
        System.out.println("A madár repül.");
    }

    @Override
    public void leszall() {
        System.out.println("A madár leszáll.");
    }

    @Override
    public void legel() {
        System.out.println("A madár növényeket eszik.");
    }

    @Override
    public void rag() {
        System.out.println("A madár rág.");
    }

    @Override
    public void vadaszik() {
        System.out.println("A madár vadászik.");
    }

    @Override
    public void tamad() {
        System.out.println("A madár támad.");
    }
}

