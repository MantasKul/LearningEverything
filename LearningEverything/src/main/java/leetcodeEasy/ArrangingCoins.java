// Problem: https://leetcode.com/problems/arranging-coins/
package leetcodeEasy;

public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int steps = 0;
        while(n > 0) {
            if(n > steps) {
                steps++;
                n -= steps;
            }
            if(n <= steps) n = 0;
        }

        return steps;
    }
}
