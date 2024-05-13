import java.util.LinkedList;

public class ShoppingList {
    //We are going to represent a shopping list by a list containing strings.
    //
    //Create a linked list with the following items:
    // eggs, milk, fish, apples, bread and chicken
    //Create an application which prints out the answers to the following questions:
    // - Do we have milk in the shopping list? (yes/no)
    // - Do we have bananas in the shopping list? (yes/no)
    //The full output of your main method should be the following:
    //
    //yes
    //no
    //
    // The question have to be a method.
    public static void main(String[] args) {
        LinkedList<String> shop = new LinkedList<>();
        shop.add("eggs");
        shop.add("milk");
        shop.add("fish");
        shop.add("apples");
        shop.add("bread");
        shop.add("chicken");
        boolean vanmilk = shop.contains("milk");
        boolean vanbanana = shop.contains("banana");
        System.out.println(vanmilk ? "yes":"no");
        System.out.println(vanbanana ? "yes":"no");

    }
        

    

}
