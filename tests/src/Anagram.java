import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
    public static void main(String[] args){
        Anagram anagramChecker = new Anagram();
        String test1 = "listen";
        String test2 = "silent";
        System.out.println("\"" + test1 + "\", \"" + test2 + "\" anagramja? " + anagramChecker.isAnagram(test1, test2));
    }
}

