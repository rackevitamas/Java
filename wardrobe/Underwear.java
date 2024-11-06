
public class Underwear extends Cloth{
    public Underwear(String type, String color, int condition){
        super(type, color, condition);
    }

    public boolean needToBeWashed(){
        return this.daysWorn >= 1;
    }

    public boolean  needToBeRepaired(){
        return false;
    }

    public String getInfo(){
        return type + "ruha, " + color + ", állapota " + condition;
    }
}