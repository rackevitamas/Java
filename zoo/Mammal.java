package zoo;

public class Mammal implements Szarazfoldi, Vizi, Novenyevo, Ragadozo {

    String breed;
    String sound;
    boolean isLandAnimal = false;

    public Mammal(String name, String breed, int age, boolean gender) {
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
        System.out.println("Az emlős jár a szárazföldön.");
    }

    @Override
    public void fut() {
        System.out.println("Az emlős fut.");
    }

    @Override
    public void uszik() {
        System.out.println("Az emlős úszik.");
    }

    @Override
    public void merul() {
        System.out.println("Az emlős merül.");
    }

    @Override
    public void legel() {
        System.out.println("Az emlős növényeket eszik.");
    }

    @Override
    public void rag() {
        System.out.println("Az emlős rág.");
    }

    @Override
    public void vadaszik() {
        System.out.println("Az emlős vadászik.");
    }

    @Override
    public void tamad() {
        System.out.println("Az emlős támad.");
    }
}

