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
}

class Student extends Person {
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

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course.");
    }

    public void getGoal() {
        System.out.println("My goal is: " + goal + ".");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Student uj = new Student("Jane Doe", 30, "female", "To live moment!", "The school of Life");
        uj.introduce();
        uj.skipDays(0);
        uj.getGoal();
    }
}
