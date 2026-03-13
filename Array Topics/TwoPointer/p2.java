package TwoPointer;

// Q..Convert characters to lowercase so 'A' and 'a' are treated the same
// input : s = "A man, a plan, a canal: Panama"
// output :true
public class p2 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(paliDrone(str));
    }

    public static boolean paliDrone(String str) {
        int n = str.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(str.charAt(l))) {
                // Skip characters that are not(!) letters or digits means(ignore spaces, commas,
                // symbols)
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(r))) {
                // Skip characters that are not(!) letters or digits means(ignore spaces, commas,
                // symbols)
                r--;
                continue;
            }

            char left = Character.toLowerCase(str.charAt(l));// Convert characters to lowercase so 'A' and 'a' are
                                                             // treated the same
            char right = Character.toLowerCase(str.charAt(r));// Convert characters to lowercase so 'A' and 'a' are
                                                              // treated the same

            if (left != right) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
