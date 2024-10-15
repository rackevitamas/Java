public class Main {
    public static void main(String[] args) {
        Execute shop = new Execute();

        ShopItem milk = new Dairy("Tej", 200, 0.1, 4, true);
        ShopItem cheese = new Dairy("Sajt", 300, 0.5, 6, true);
        ShopItem carrot = new Vegetable("Répa", 100, 2);
        ShopItem lettuce = new Vegetable("Saláta", 1.00, 4);

        System.out.println(milk.name + " új ára: " + milk.reducePrice() + " Ft, frissesség: " + milk.calculateFreshess());
        System.out.println(cheese.name + " új ára: " + cheese.reducePrice() + " Ft, frissesség: " + cheese.calculateFreshess());
        System.out.println(carrot.name + " új ára: " + carrot.reducePrice() + " Ft, frissesség: " + carrot.calculateFreshess());
        System.out.println(lettuce.name + " új ára: " + lettuce.reducePrice() + " Ft, frissesség: " + lettuce.calculateFreshess());

        shop.fillStock(milk);
        shop.fillStock(cheese);
        shop.fillStock(carrot);
        shop.fillStock(lettuce);
        
        shop.showStock(); 
    }
}
