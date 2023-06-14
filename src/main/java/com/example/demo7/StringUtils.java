package main.java.com.example.demo7;

import java.util.Locale;
import java.util.Objects;

public class StringUtils {
    public static String findSymbolOccurrence(String newString, char symbol) {
        int j = 0;
        char[] arr = newString.toLowerCase(Locale.ROOT).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == symbol) {
                j++;
            }
        }
        return String.valueOf(j);
    }

    public static String findWordPosition(String target, String source) {
        if (source.contains(target)) {
            return String.valueOf(source.indexOf(target));
        } else {
            return "-1";
        }
    }

    public static String stringReverse(String reversibleString) {
        StringBuilder builder = new StringBuilder(reversibleString);
        return String.valueOf(builder.reverse());
    }

    public static String isPalindrome(String supposedPalindrome) {
        if (Objects.equals(supposedPalindrome, stringReverse(supposedPalindrome))) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }
}
