package easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LC_014 {
    public static void main(String[] args) {
        String[] values = {"dog,racecar,car"};
        System.out.println(longestCommonPrefix(values));
    }

    public static String longestCommonPrefix(String[] values) {
        HashMap<Character, Integer> freq = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String value : values) {
            for (int i = 0; i < value.length(); i++) {
                char x = value.charAt(i);
                if (freq.containsKey(x)) freq.put(x, freq.get(x) + 1);
                else freq.put(x, 1);
            }
        }
        print(freq);
        int maxFrequency = Collections.max(freq.values());
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFrequency) {
                Character x = e.getKey();
                result.append(x);
            }
        }
        return String.valueOf(result);
    }

    private static void print(HashMap<?, ?> freq) {
        for (Map.Entry<?, ?> e : freq.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
