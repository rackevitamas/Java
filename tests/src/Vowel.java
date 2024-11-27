public class Vowel {
    public boolean isVowel(char character) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(character) != -1;
    }

    public static void main(String[] args) {
        Vowel vChecker = new Vowel();
        char v = 'a';
        System.out.printf("Magánhangzó? " + v + ": " + vChecker.isVowel(v));
    }
}
