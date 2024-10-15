public class Vegetable extends ShopItem {

    public Vegetable(String name, double price, int daysInTheShop){
        this.name = name;
        this.price = price;
        this.preservativePercentage = 0;
        this.daysInTheShop = daysInTheShop;
        this.isMilkFamily = false;
    }
    @Override
    public int calculateFreshess() {
        if (daysInTheShop > 3) {
            return 0;
        } else if (daysInTheShop > 1) {
            return 1;
        } else {
            return 2;
        }
    }
    

    @Override
    public double reducePrice() {
        if (calculateFreshess() == 0) {
            return price * 0.60;
        } else if (calculateFreshess() == 1) {
            return price * 0.80;
        }
        return price;
    }
}
