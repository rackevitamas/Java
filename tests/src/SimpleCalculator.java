public class SimpleCalculator{
    public int add (int a){
        if(a < 0 || a > 100){
            throw new IllegalArgumentException();
        }
        return a;
    }

    public char determineLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
        int score = 50;
        System.out.println("Score: " + score + ", Grade: " + sc.determineLetterGrade(score));
    }
}