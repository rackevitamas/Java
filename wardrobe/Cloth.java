public class Cloth{
    String type;
    String color;
    int condition;
    int daysWorn;

    public Cloth(String type, String color, int condition){
        type = this.type;
        color = this.color;
        condition = this.condition;
        daysWorn = 0;
    }

    public void wear() throws Exception{
        if (condition <= 0){
            throw new Exception("This cloth cannot be wear");
        }
        daysWorn++;
        condition--;
    }

    public void wash(){
        daysWorn = 0;
        if (condition > 0)
            condition--;
    }

    public void repair(){
        condition = this.condition;
    }

    public String getInfo(){
        return daysWorn + " napig hordott, " + color + " " + type + ", " + condition + " mosási ciklus van hátra";
    }


}