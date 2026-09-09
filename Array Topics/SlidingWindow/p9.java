import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p9 {
    // Given two strings s and p, return an array of all the start indices of p's
    // anagrams in s. You may return the answer in any order.

    // Example 1:

    // Input: s = "cbaebabacd", p = "abc"
    // Output: [0,6]
    // Explanation:
    // The substring with start index = 0 is "cba", which is an anagram of "abc".
    // The substring with start index = 6 is "bac", which is an anagram of "abc".
    // Example 2:

    // Input: s = "abab", p = "ab"
    // Output: [0,1,2]
    // Explanation:
    // The substring with start index = 0 is "ab", which is an anagram of "ab".
    // The substring with start index = 1 is "ba", which is an anagram of "ab".
    // The substring with start index = 2 is "ab", which is an anagram of "ab".
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> arr = findAnagrams(s, p);
        System.out.println(arr);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        // 438. Find All Anagrams in a String
        int n = s.length();
        int k = p.length();
        List<Integer> ans = new ArrayList<>();
        if (k > n) {
            return ans;
        }
        int a[] = new int[26];
        int b[] = new int[26];
        for (int i = 0; i < k; i++) {
            a[p.charAt(i) - 'a']++;
        }
        for (int i = 0; i < k; i++) {
            b[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a, b)) {
            ans.add(0);
        }
        for (int i = k; i < n; i++) {
            b[s.charAt(i) - 'a']++;
            b[s.charAt(i - k) - 'a']--;

            if (Arrays.equals(a, b)) {
                ans.add(i - k + 1);
            }
        }
        return ans;
    }
}
