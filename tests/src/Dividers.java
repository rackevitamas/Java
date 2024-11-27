public class Dividers {
    public int dividersNumbers(int number){
        if (number < 1){
            throw new IllegalArgumentException("A számnak pozitívnak kell lennie!");
        }

        int db = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                db++;
            }
        }

        return db;
    }

    public static void main(String[] args) {
        Dividers dividerChecker = new Dividers();
        System.out.println("A megadott szám elosztói száma: " + dividerChecker.dividersNumbers(5));
    }
}
