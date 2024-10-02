
public class Polymorphism {
    public static void main(String[] args) {
        Person5 peti = new Person5("Péter", 18, "Férfi");
        Student peter = new Student("Péter", 15, "Férfi", "alt suli", 15);
        peti.getGoal();
        peti.introduce();
        peter.getGoal();
        peter.introduce();
    }
}
