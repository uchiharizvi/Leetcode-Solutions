package easy;

import java.util.Arrays;

/**
 * Valid Parenthesis
 */
public class LC_58 {
    public static void main(String[] args) {
        LC_58 obj = new LC_58();
        obj.lengthOfLastWord("Hello World");
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        String x[] = s.split(" ");
        for (int i = 0; i < x[x.length - 1].length(); i++) count++;
        return count;
    }
}
