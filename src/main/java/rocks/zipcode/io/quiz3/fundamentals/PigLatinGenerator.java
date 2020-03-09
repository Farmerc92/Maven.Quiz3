package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        if (startsWithVowel(str)){
            return str + "way";
        }
        else if (!startsWithVowel(str)){
            String output = str.substring(1, str.length());
            output += Character.toUpperCase(str.charAt(0));
        }
        return null;
    }
    public static Boolean startsWithVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ((ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch== 'o' || ch == 'O' || ch == 'u' || ch == 'U') && i == 0)
                return true;
            else
                return false;
        }
        return false;
    }
}
