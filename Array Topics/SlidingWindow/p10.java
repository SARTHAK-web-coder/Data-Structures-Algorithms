import java.util.Arrays;

public class p10 {
//     Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

// In other words, return true if one of s1's permutations is the substring of s2.

 

// Example 1:

// Input: s1 = "ab", s2 = "eidbaooo"
// Output: true
// Explanation: s2 contains one permutation of s1 ("ba").
// Example 2:

// Input: s1 = "ab", s2 = "eidboaoo"
// Output: false
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
     public static  boolean checkInclusion(String s1, String s2) {
        //567. Permutation in String
        int k = s1.length();
        int n = s2.length();
        if (k > n) {
            return false;
        }
        int a[] = new int[26];
        int b[] = new int[26];
        for (int i = 0; i < k; i++) {
            a[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < k; i++) {
            b[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(a, b)) {
            return true;
        }
        for (int i = k; i < n; i++) {
            b[s2.charAt(i) - 'a']++;
            b[s2.charAt(i - k) - 'a']--;
            if (Arrays.equals(a, b)) {
                return true;
            }
        }
        return false;
    }
}
