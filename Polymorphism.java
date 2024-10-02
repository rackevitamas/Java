
class Person {
    protected String name;
    protected int age;
    protected String gender;
    protected String goal;

    public Person() {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goal = goal;
    }
    public Person(String name, int age, String gender, String goal) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goal = goal;
    }

void getGoal(){
  System.out.println("Célom: " + this.goal);
}
void introduce(){
    
}
}
class Student extends Person{
    private String previousOrganization;
    private int skippedDays;
    public Student() {
        super();
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }
    public Student(String name, int age, String gender, String goal, String previousOrganization) {
        super(name, age, gender, goal);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }
    void getGoal(){
        System.out.println("Célom: Be a junior software developer.");
    }
    void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Person pre = new Person();
        pre.name = "Nagyi";
        pre.age = 65;
        pre.gender = "nő";
        pre.goal = "Élj a pillanatnak";
        pre.introduce();
        pre.getGoal();
    }
}