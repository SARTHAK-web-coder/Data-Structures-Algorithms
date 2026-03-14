package TwoPointer;

public class p3 {
    // Sample Input
    // s = ["h","e","l","l","o"]
    // Sample Output
    // ["o","l","l","e","h"]

    public static void main(String[] args) {
        char s[] = { 'o', 'm', 'k', 'a', 'r', 'e' };
        reCharString(s);
        System.out.print(s);

    }

    public static void reCharString(char s[]) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];// temp is used as a temporary storage variable so values can be swapped without
                             // losing data.
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

    }
}
