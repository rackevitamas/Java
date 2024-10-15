public abstract  class ShopItem{
    public String name;
    public double price;
    public double preservativePercentage;
    public int daysInTheShop = 0;
    public boolean isMilkFamily;

    public abstract int calculateFreshess();
    public abstract double reducePrice();
}