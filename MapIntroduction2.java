import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings
        // with the following initial values
        //978-1-60309-452-8 : A Letter to Jo, 978-1-60309-459-7 : Lupus
        //978-1-60309-444-3 : Red Panda and Moon Bear, 978-1-60309-461-0 : The Lab
        HashMap<String, String> adat = new HashMap<>();

        //Print all the key-value pairs in the following format
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)
        adat.put("A Letter to Jo", "(ISBN: 978-1-60309-452-8)");
        adat.put("Lupus", "(ISBN: 978-1-60309-459-7)");
        adat.put("Red Panda and Moon Bear", "(ISBN: 978-1-60309-444-3)");
        adat.put("The Lab", "(ISBN: 978-1-60309-461-0)");
        adat.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
        //Remove the key-value pair with key 978-1-60309-444-3
        adat.remove("(ISBN: 978-1-60309-444-3)");

        //Remove the key-value pair with value The Lab
        adat.values().removeIf(value -> value.contains("The Lab"));

        //Add the following key-value pairs to the map
        //978-1-60309-450-4 : They Called Us Enemy, 978-1-60309-453-5 : Why Did We Trust Him?
        adat.put("They Called Us Enemy", "(ISBN: 978-1-60309-450-4)");
        adat.put("Why Did We Trust Him?", "(ISBN: 978-1-60309-453-5)");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        System.out.println(adat.containsValue("478-0-61159-424-8"));

        //Print the value associated with key 978-1-60309-453-5
        for(Map.Entry m : adat.entrySet()){
            if (m.getValue().toString().contains("978-1-60309-453-5")) {
                System.out.println(m.getKey().toString());
            }
        }
        
    }

    // Output:
    //    A Letter to Jo (ISBN: 978-1-60309-452-8)
    //    Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
    //    Lupus (ISBN: 978-1-60309-459-7)
    //    The Lab (ISBN: 978-1-60309-461-0)
    //    false
    //    Why Did We Trust Him?
}