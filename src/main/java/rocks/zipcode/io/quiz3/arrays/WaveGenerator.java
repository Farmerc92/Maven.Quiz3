package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] buffer = new String[str.length()];
        String saveString = str.toLowerCase();
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                StringBuilder build = new StringBuilder(saveString);
                build.setCharAt(i, Character.toUpperCase(str.charAt(i)));
                buffer[j++] = build.toString();
            }
        }
        String[] output = new String[j];
        for (int i = 0; i < output.length; i++) {
            output[i] = buffer[i];
        }
        return output;
    }
}
