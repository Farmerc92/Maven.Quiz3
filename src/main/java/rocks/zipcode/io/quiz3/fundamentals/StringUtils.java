package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        Character c = Character.toUpperCase(str.charAt(indexToCapitalize));
        StringBuilder build = new StringBuilder(str);
        build.setCharAt(indexToCapitalize, c);
        return build.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return (baseString.charAt(indexOfString) == characterToCheckFor);
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> list = new HashSet<>();
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
