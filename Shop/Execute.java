import java.util.ArrayList;
import java.util.List;

public class Execute {


    List<ShopItem> items = new ArrayList<>();

    
    public void fillStock(ShopItem item){
        items.add(item);
    }
    
    public void showStock() {
        int index = 1;
        for (ShopItem shopItem : items) {
            String freshness = "";
            if (shopItem.isMilkFamily) {
                if (shopItem.daysInTheShop > 5) {
                    freshness = "bad freshness";
                } else if (shopItem.daysInTheShop > 3) {
                    freshness = "ok freshness";
                } else {
                    freshness = "good freshness";
                }
            } else {
                if (shopItem.daysInTheShop > 3) {
                    freshness = "bad freshness";
                } else if (shopItem.daysInTheShop > 1) {
                    freshness = "ok freshness";
                } else {
                    freshness = "good freshness";
                }
            }
            System.out.println(index + ". item: " + shopItem.name + ", " + shopItem.price + " Ft, " + freshness);
            index++;
        }
    }
    
}
