package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    public String translate(String str) {
        String[] array = str.split(" ");
        String output = "";
        for (int i = 0; i < array.length; i++) {
            if (VowelUtils.startsWithVowel(array[i])){
                if (i == array.length -1 )
                    output += array[i] + "way";
                else
                    output += array[i] + "way ";
            }
            else if (!VowelUtils.hasVowels(array[i])){
                if (i == array.length -1 )
                    output += array[i] + "ay";
                else
                    output += array[i] + "ay ";
            }
            else {
                String subA = array[i].substring(0, VowelUtils.getIndexOfFirstVowel(array[i]));
                String subB = array[i].substring(VowelUtils.getIndexOfFirstVowel(array[i]), array[i].length());
                if (i == array.length - 1)
                    output += subB + subA + "ay";
                else
                    output += subB + subA + "ay ";
            }
        }
        return output;
    }
}
