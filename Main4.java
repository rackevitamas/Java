class Person4 {
    private String name;
    private int age;
    private Boolean man;
    private String cel;

    //Getter
    public Person4(String name, int age, Boolean man, String cel){
        this.name = name;
        this.age = age;
        this.man = man;
        this.cel = cel;
    }

    //Setter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Boolean getMan(){
        return man;
    }
    public String getCel(){
        return cel;
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

public class Main4 {
  
  public static void main(String[] args) {

    Person4 pre = new Person4("Nagyi", 65, false, "Élj a pillanatnak!");
    pre.introduce();
    pre.getGoal();
    
    Person4 pre2 = new Person4("Papi", 68, true, "Légy támasz a családnak!");
    pre2.introduce();
    pre2.getGoal();
    
    Person4 pre3 = new Person4("Api", 41, true, "Keressen kenyeret családnak!");
    pre3.introduce();
    pre3.getGoal();
    
  }
}