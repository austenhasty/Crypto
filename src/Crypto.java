import java.util.*;

public class Crypto {
    public static void main(String[] args) {

    }

    public static String normalizeText(String text) {
        text = text.replaceAll("[^A-Za-z]+", "").toUpperCase();
        return text;
    }

    public static String caesarify(String text, int num) {

    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
}
