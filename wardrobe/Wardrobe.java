
import java.util.ArrayList;
import java.util.List;

public class Wardrobe{
    

    List<Cloth> Cabinet = new ArrayList<>();

    public void addCloth(Cloth cloth){
        this.Cabinet.add(cloth);
    }

    public String printInfo(){
        for (Cloth cloth : this.Cabinet){
            System.out.println(cloth.getInfo());
        }
        return "";
    }

    public void washAllClothes(){
        for (Cloth cloth : this.Cabinet){
            Overwear owear = (Overwear) cloth;
            Underwear uwear = (Underwear) cloth;
            if(owear.needToBeWashed() || uwear.needToBeWashed())
                cloth.wash();
        }
    }

    public void repairAllClothes(){
        for (Cloth cloth : this.Cabinet){
            Overwear owear = null;
            Underwear uwear = null;
            if(owear.needToBeRepaired() || uwear.needToBeRepaired())
                cloth.repair();
        }
    }

    public List purge(){
        List<Cloth> Rubbish = new ArrayList<>();
        for (Cloth cloth : this.Cabinet){
            if (cloth.condition == 0){
                Rubbish.add(cloth);
                this.Cabinet.remove(cloth);
            }
        }
        return Rubbish;
    }
}