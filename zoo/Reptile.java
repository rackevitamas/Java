package zoo;

public class Reptile implements Szarazfoldi, Novenyevo, Ragadozo {

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

    @Override
    public void jar() {
        System.out.println("A hüllő jár.");
    }

    @Override
    public void fut() {
        System.out.println("A hüllő fut.");
    }

    @Override
    public void legel() {
        System.out.println("A hüllő növényeket eszik.");
    }

    @Override
    public void rag() {
        System.out.println("A hüllő rág.");
    }

    @Override
    public void vadaszik() {
        System.out.println("A hüllő vadászik.");
    }

    @Override
    public void tamad() {
        System.out.println("A hüllő támad.");
    }
}

