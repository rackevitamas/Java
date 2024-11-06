
public class Overwear extends Cloth{
    public Overwear(String type, String color, int condition){
        super(type, color, condition);
    }


    public boolean needToBeWashed(){
        return this.daysWorn >= 5;
    }

    public boolean  needToBeRepaired(){
        return condition >= 1 && condition <= 5;
    }

    public String getInfo(){
        return type + "ruha, " + color + ", állapota " + condition;
    }
}