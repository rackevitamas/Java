
public class Dairy extends ShopItem {

    public Dairy(String name, double price, double preservativePercentage, int daysInTheShop, boolean isMilkFamily){
        this.name = name;
        this.price = price;
        this.preservativePercentage = preservativePercentage;
        this.daysInTheShop = daysInTheShop;
        this.isMilkFamily = isMilkFamily;
    }

    @Override
    public int calculateFreshess() {
        if (daysInTheShop > 5) {
            return 0;
        } else if (daysInTheShop > 3) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public double reducePrice() {
        if (calculateFreshess() == 0) {
            return price * 0.50;
        } else if (calculateFreshess() == 1) {
            return price * 0.70;
        }
        return price;
    }
}
