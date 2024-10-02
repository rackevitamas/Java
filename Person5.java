/* class Person5 {
    protected String name;
    protected int age;
    protected String gender;
    protected String goal;

    public Person5() {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.goal = goal;
    }
    
    public Person5(String name, int age, String gender, String goal) {
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
class Student extends Person5{
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
        Person5 pre = new Person5("Nagyi", 65, "nő", "Élj a pillanatnak"); 
        pre.getGoal();
        pre.introduce();
    }
} */
public class Person5{
    private String name;
    private int age;
    private String gender;
    
    public Person5(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //sajatod
    public Person5(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Person5(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person5(int age, String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + "year old " + gender);
    }
}