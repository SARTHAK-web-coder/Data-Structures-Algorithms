public class p4 {
    // Given a string s and an integer k, return the maximum number of vowel letters
    // in any substring of s with length k.
    // Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

    // Example 1:
    // Input: s = "abciiidef", k = 3
    // Output: 3
    // Explanation: The substring "iii" contains 3 vowel letters.
    // Example 2:

    // Input: s = "aeiou", k = 2
    // Output: 2
    // Explanation: Any substring of length 2 contains 2 vowels.
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }

    public static int maxVowels(String s, int k) {
        int n = s.length();
        int chars[] = new int[128];
        chars['a']++;
        chars['e']++;
        chars['i']++;
        chars['o']++;
        chars['u']++;
        int c = 0;
        for (int i = 0; i < k; i++) {
            c = c + chars[s.charAt(i)];
        }
        int max = c;
        for (int i = k; i < n; i++) {
            c = c - chars[s.charAt(i - k)];
            c = c + chars[s.charAt(i)];
            max = Math.max(max, c);
        }
        return max;

    }
}
