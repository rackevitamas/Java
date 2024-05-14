import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MapIntroduction1 {
    public static void main(String[] args) {

        //We are going to play with maps. Feel free to use the built-in methods where possible.
        //
        //Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, String> sztatisztika = new HashMap<>();
        

        //Print out whether the map is empty or not
        System.out.println(sztatisztika.isEmpty());

        //Add the following key-value pairs to the map
        //97 : a, 98 : b, 99 : c, 65 : A, 66 : B, 67 : C
        sztatisztika.put(97, "a");
        sztatisztika.put(98, "b");
        sztatisztika.put(99, "c");
        sztatisztika.put(65, "A");
        sztatisztika.put(66, "B");
        sztatisztika.put(67, "C");

        //Print all the keys
        ArrayList<Integer> keys = new ArrayList<Integer>();
        for(Map.Entry m : sztatisztika.entrySet()){
            keys.add( (Integer) m.getKey());
        }
        System.out.println(keys);

        //Print all the values
        ArrayList<String> values = new ArrayList<String>();
        for(Map.Entry m : sztatisztika.entrySet()){
            values.add( (String) m.getValue());
        }
        System.out.println(values);
        //Add value D with the key 68
        sztatisztika.put(68, "D");

        //Print how many key-value pairs are in the map
        System.out.println(sztatisztika.size());

        //Print the value that is associated with key 99
        System.out.println(sztatisztika.get(99));

        //Remove the key-value pair with key 97 and print the associated value
        String c = sztatisztika.remove(97);
        System.out.println(c);

        //Print whether there is an associated value with key 100 or not
        System.out.println(sztatisztika.containsKey(100));

        //Remove all the key-value pairs
        sztatisztika.clear();

        //Print how many key-value pairs are in the map
        System.out.println(sztatisztika.size());

    }

    // Output:
    // true
    // [97, 65, 98, 66, 99, 67]
    // [a, A, b, B, c, C]
    // 7
    // c
    // a
    // false
    // 0

}