public class Student extends Person5 {
    String previousOrganization;
    int skippedDays;
    public Student(String name, int age, String gender, String previousOrganization, int skippedDays){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    public void introduce(){
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + "year old " + getGender() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }
}
