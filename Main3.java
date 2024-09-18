class Person3 {
    private String name;
    private int age;
    private Boolean man;
    private String cel;

    public Person3(String name, int age, Boolean man, String cel){
        this.name = name;
        this.age = age;
        this.man = man;
        this.cel = cel;
    }

    public void getGoal(){
        System.out.println("Célom: " + this.cel);
    }
    public void introduce(){
        if (man) {
            System.out.printf("Szia, %s vagyok, %d éves férfi. ", this.name, this.age);
        
        } else {
            System.out.printf("Szia, %s vagyok, %d éves nő. ", this.name, this.age);
        
        }
    }
}

public class Main3 {
  
  public static void main(String[] args) {

    Person3 pre = new Person3("Nagyi", 65, false, "Élj a pillanatnak!");
    pre.introduce();
    pre.getGoal();
    
    Person3 pre2 = new Person3("Papi", 68, true, "Légy támasz a családnak!");
    pre2.introduce();
    pre2.getGoal();
    
    Person3 pre3 = new Person3("Api", 41, true, "Keressen kenyeret családnak!");
    pre3.introduce();
    pre3.getGoal();
    
  }
}