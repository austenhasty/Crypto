import java.util.*;

public class Crypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Crypto Application");
        System.out.println();
        System.out.print("Please enter some text to encrypt: ");
        String text = input.nextLine();
        System.out.println();
        System.out.print("Please enter a number for your encryption key: ");
        int num = input.nextInt();
    }

    public static String normalizeText(String text) {
        text = text.replaceAll("[^A-Za-z]+", "").toUpperCase();
        return text;
    }

    public static String caesarify(String text, int num) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftAlphabet = shiftAlphabet(num);
        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            int placeholder = alphabet.indexOf(text.substring(i, i + 1));
            newText += shiftAlphabet.substring(placeholder, placeholder + 1);
        }
        return newText;
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

    public static String groupify(String text, int size) {
        String newText = "";
        while (text.length() >= size) {
            String group = text.substring(0, size);
            text = text.substring(size);
            newText = newText + group + " ";
        }
        if (text.length() != 0) {
            newText = newText + text;

            for (int i = 0; i < size - text.length(); i++) {
                newText = newText + "x";
            }
        }
        return newText;
    }
}
