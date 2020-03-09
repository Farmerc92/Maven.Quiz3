package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch== 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch== 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                return i;
        }
        return -1;
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

    public static Boolean isVowel(Character character) {
        Character ch = character;
        return (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch== 'o' || ch == 'O' || ch == 'u' || ch == 'U');
    }
}
