package TwoPointer;
// Q..Convert characters to lowercase so 'A' and 'a' are treated the same
// input : s = "A man, a plan, a canal: Panama"
// output :true
public class p2 {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(paliDrone(str));
    }

    public static boolean paliDrone(String str) {
        int n = str.length();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            Character.toLowerCase(l);// Convert characters to lowercase so 'A' and 'a' are treated the same
            Character.toLowerCase(r);// Convert characters to lowercase so 'A' and 'a' are treated the same
            if (Character.isLetterOrDigit(l)) {
                // Skip characters that are not letters or digits (ignore spaces, commas,
                // symbols)
                l++;
            }
            if (Character.isLetterOrDigit(r)) {
                // Skip characters that are not letters or digits (ignore spaces, commas,
                // symbols)
                r--;
            }
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
