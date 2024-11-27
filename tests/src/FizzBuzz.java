public class FizzBuzz {
    public Object fB(int number){
        if (number % 5 == 0 && number % 3 == 0){
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return number;
    }

    public static void main(String[] args) {
        FizzBuzz checkOb = new FizzBuzz();
        System.out.println("A megadott szám alapján: " + checkOb.fB(5));
    }
}
