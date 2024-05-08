import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        //We are going to play with lists. Feel free to use the built-in methods where possible.
        //
        //Create an empty list which will contain names (strings)
        ArrayList<String> contain = new ArrayList<>(); 

        //Print out the number of elements in the list
        System.out.println(contain.size());

        //Add "William" to the list
        contain.add("William");

        //Print out whether the list is empty or not
        System.out.println(contain.isEmpty());

        //Add "John" to the list
        contain.add("John");

        //Add "Amanda" to the list
        contain.add("Amanda");

        //Print out the number of elements in the list
        System.out.println(contain.size());

        //Print out the 3rd element
        System.out.println(contain.subList(2, 3));

        //Iterate through the list and print out each name
        System.out.println(contain.subList(0, 1));
        System.out.println(contain.subList(1, 2));
        System.out.println(contain.subList(2, 3));

        //Iterate through the list and print
        System.out.println(contain);

        //Remove the 2nd element
        contain.remove(1);

        //Iterate through the list in a reversed order and print out each name
        System.out.println(contain.reversed());

        //Remove all elements
        contain.clear();

        //Print out the number of elements in the list
        System.out.println(contain.size());

        // Output:
        //0
        //false
        //3
        //Amanda
        //William
        //John
        //Amanda
        //1. William
        //2. John
        //3. Amanda
        //Amanda
        //William
        //0
    }
}
