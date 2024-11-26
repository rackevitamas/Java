public class Anagram {
    public boolean isAnagram(String a, String b){
        if (a.length() == b.length()){
            for (int i = 0; i < a.length(); i++) {
                for (int j = 0; j < b.length(); j++){
                    if (a.charAt(i) == b.charAt(j)){
                        return true;
                    }
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

    }
}

