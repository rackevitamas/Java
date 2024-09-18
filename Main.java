class Person {
    String name;
    int age;
    Boolean man;
    String cel;

void getGoal(){
  System.out.println("Célom: " + this.cel);
}
void introduce(){
    if (man) {
        System.out.printf("Szia, %s vagyok, %d éves férfi. ", this.name, this.age);
        
    } else {
        System.out.printf("Szia, %s vagyok, %d éves nő. ", this.name, this.age);
        
    }
}

}
public class Main {
  public static void main(String[] args) {
    Person pre = new Person();
    pre.name = "Nagyi";
    pre.age = 65;
    pre.man = false;
    pre.cel = "Élj a pillanatnak";
    pre.introduce();
    pre.getGoal();
    Person pre2 = new Person();
    pre2.name = "Papi";
    pre2.age = 68;
    pre2.man = true;
    pre2.cel = "Légy támasz a családnak!";
    pre2.introduce();
    pre2.getGoal();
    Person pre3 = new Person();
    pre3.name = "Api";
    pre3.age = 41;
    pre3.man = true;
    pre3.cel = "Keressen kenyeret családnak!";
    pre3.introduce();
    pre3.getGoal();
  }
}