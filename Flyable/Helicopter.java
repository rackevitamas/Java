package Flyable;

public class Helicopter extends Vehicle implements Flyable1 {
    boolean isLand;

    public Helicopter(String type, int speed, boolean isTruck){
        this.type = type;
        this.speed = speed;
        this.isTruck = isTruck;
    }

    public void setLand(boolean land){
        this.isLand = land;
    }

    @Override
    public boolean land(){
        return isLand; 
    }
    @Override
    public String fly(){
        if(isLand){
            return "Helicopter is out of use.";
        } else{
            return "Helicopter flies";
        }
    }
    @Override
    public void takeOff(){
        System.out.println("Helicopter is taking off.");
        this.isLand = false;
    }
    @Override
    public String toString(){
        return "Helikopter{" +
            "type: " + type +
            ", isLand: " + isLand +
            ", speed: " + speed +
            ", isTruck: " + isTruck + "}";
    }
}
