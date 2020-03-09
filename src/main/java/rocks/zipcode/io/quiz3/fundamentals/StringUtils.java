package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        for (int i = 0; i < str.length(); i++) {
            if (i == indexToCapitalize){
                str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
            }
        }
        return str;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
            }
        }
        String[] output = new String[list.size()];
        output = list.toArray(output);
        return output;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
