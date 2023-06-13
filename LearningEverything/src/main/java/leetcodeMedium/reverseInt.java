// Reverse int number
// https://leetcode.com/problems/reverse-integer/
// Using loop

package leetcodeMedium;

public class reverseInt {
    public int reverse(int x) {
        int reversed = 0;
        boolean negative = false;

        if(x < 0) {
            x*=-1;
            negative = true;
        }

        while(x > 0) {
            reversed = (reversed*10) + (x%10);
            x /= 10;
        }

        if(negative) reversed *= -1;

        return reversed;
    }
}
