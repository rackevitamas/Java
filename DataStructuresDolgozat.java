import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataStructuresDolgozat {


    

    public static void main(String[] args) {

        // Hozz létre egy változót, mely fővárosok neveit tárolja.
        // 1 pont
        ArrayList<String> fovarosok = new ArrayList<>();

        // Tartalmazza az alábbi adatokat: "Wien", "Budapest", "Prag", "Bratislava"
        // 2 pont
        fovarosok.add("Wien");
        fovarosok.add("Budapest");
        fovarosok.add("Prag");
        fovarosok.add("Bratislava");


        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(fovarosok);

        // Add hozzá a "Ljubljana", "Sarajevo" és "Zagreb" értékeket a fővásrosok listájához
        // az ujElemHozzaadasa() metódussal
        // 3 pont
        ujElemHozzaadasa(fovarosok, "Ljubljana");
        ujElemHozzaadasa(fovarosok, "Sarajevo");
        ujElemHozzaadasa(fovarosok, "Zagreb");


        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(fovarosok);

        // Töröld a fővárosok listából "Sarajevo" elemet a torolElemet() metódussal
        // 1 pont
        torolElemet(fovarosok, "Sarajevo");

        // Írasd ki a fővárosokat!
        // 1 pont
        System.out.println(fovarosok);

        // Hozz létre egy változót, mely főváros, ország párokat tartalmaz.
        // 1 pont
        HashMap<String, String> orszagPar = new HashMap<>();

        // A tartalma a főváros, ország pároknak a következő legyen:
        // "Wien", "Österreich"
        // "Budapest", "Magyarország"
        // "Ljubljana", "Slovenija"
        // 3 pont
        orszagPar.put("Wien", "Österreich");
        orszagPar.put("Budapest", "Magyarország");
        orszagPar.put("Ljubljana", "Slovenija");
        

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        System.out.println(orszagPar);

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Budapest"
        // 1 pont
        fovarosOrszaga(orszagPar, "Budapest");
        

        // Írad ki a fovarosOrszaga() metódussal, hogy mely ország fővárosa "Zagreb"
        // 1 pont
        fovarosOrszaga(orszagPar, "Zagreb");


        // Az ujFovarosOrszagPar() metódussal add hozzá a "Zagreb", "Hrvatska" párt a fővárosok országok párokhoz
        // 1 pont
        ujFovarosOrszagPar(orszagPar, "Zagreb", "Hrvatska");
        //fovarosOrszaga(orszagPar, "Zagreb");
        /* for(Map.Entry m : orszagPar.entrySet()){
            System.out.println(m.getKey() + " fővárosa " + m.getValue() + ".");
        } */

        // A torolAdatPart() metódussal törld a "Ljubljana" főváros ország párt
        // 1 pont
        torolAdatPart(orszagPar, "Ljubljana");

        // A torolAdatPart() metódussal törld a "Prag" főváros ország párt
        // kezeld a felmerülő hibát és írd ki a hibát
        // 3 pont
        torolAdatPart(orszagPar, "Prag");

        // Írasd ki a főváros, ország párokat!
        // 1 pont
        for(Map.Entry m : orszagPar.entrySet()){
            System.out.println(m.getKey() + " fővárosa " + m.getValue() + ".");
        }
    }

    /**
     * ujElemHozzaadasa() - egy elemet ad hozzá a megadott listához
     * @param list a lista, melyhez hozzá kell adni az elemet
     * @param elem az új elem
     */
    // 3 pont
    public static void ujElemHozzaadasa(ArrayList<String> list, String elem){
        list.add(elem);
    }

    /**
     * torolElemet() - a megadott listából törli a megadott elemet
     * @param list a lista, melyből törölni kell az elemet
     * @param elem a törlendő érték
     */
    // 3 pont
    public static void torolElemet(ArrayList<String> list, String elem){
        list.remove(elem);
    }

    /**
     * fovarosOrszaga() - a megadott főváros, ország párok és főváros adatokra visszaadja az osztágot és a fővárost,
     * vagy visszaadja, hogy az adott főváros nincs az adatai között.
     * @param countries a főváros ország párok
     * @param capital a főváros
     * @return "country fővárosa capital", ha a párok között szerepel a főváros, egyébként
     * capital nincs az adatok között.
     * Példa:
     * England fővárosa London.
     * London nincs az adatok között.
     */
    // 3 pont
    public static void fovarosOrszaga(HashMap<String, String> countries, String capital){
        if (countries.containsKey(capital)) {
            for(Map.Entry m : countries.entrySet()){
                System.out.println(m.getKey() + " fővárosa " + m.getValue() + ".");
        }
        } else {
            System.out.println(capital + " nincs az adatok között.");
        }
    }

    /**
     * ujFovarosOrszagPar() - A coutries-hoz hozzáadja a főváros ország (capital country) párt.
     * @param coutries a főváros ország párok
     * @param capital a főváros neve
     * @param country az ország neve
     */
    // 3 pont
    public static void ujFovarosOrszagPar(HashMap<String, String> coutries, String capital, String country){
        coutries.put(capital, country);
    }

    /**
     * A coutries főváros ország adatpárok közül törli a capital főváros ország adatpárt, ha szerepel benne.
     * Ha nem szerepel benne, akkor "Nincs " + capital + " főváros az adatok között" hibát dob.
     * @param coutries a főváros ország adatpárok
     * @param capital a főváros neve
     * @throws IllegalArgumentException
     */
    // 5 pont
    public static void torolAdatPart(HashMap<String, String> coutries, String capital){
        if (coutries.containsKey(capital)) {
            for(Map.Entry m : coutries.entrySet()){
                coutries.remove(m.getKey(), m.getValue());
        }
        } else {
            throw new IllegalArgumentException("Nincs " + capital + " az adatok között.");
        }
    } 
    
    
}
