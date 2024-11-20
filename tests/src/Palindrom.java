import java.util.ArrayList;

public class Palindrom {
    public String addS(String szo){
        if (szo.length() <= 0){
            throw new IllegalArgumentException();
        }
        return szo;
    }

    public boolean IsPalindrom(String szo){
        for (int i = 0; i < szo.length(); i++){
            for (int j = szo.length() - 1; j > 0; j--){
                if (szo[i] != szo[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
