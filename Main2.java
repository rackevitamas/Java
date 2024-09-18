class Person2 {
    String name;
    int age;
    Boolean man;
    String cel;

    public Person2(String name, int age, Boolean man, String cel){
        this.name = name;
        this.age = age;
        this.man = man;
        this.cel = cel;
    }

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

public class Main2 {
  
  public static void main(String[] args) {

    Person2 pre = new Person2("Nagyi", 65, false, "Élj a pillanatnak!");
    pre.introduce();
    pre.getGoal();
    
    Person2 pre2 = new Person2("Papi", 68, true, "Légy támasz a családnak!");
    pre2.introduce();
    pre2.getGoal();
    
    Person2 pre3 = new Person2("Api", 41, true, "Keressen kenyeret családnak!");
    pre3.introduce();
    pre3.getGoal();
    
  }
}