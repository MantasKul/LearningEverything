// https://leetcode.com/problems/container-with-most-water/description/
// Find two lines that together with the x-axis form the biggest area
// Takes array of height of integers
// Returns max Area integer
package leetcodeMedium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int lowerPoint = 0; // lower point out of left and right side columns
        int i = 0;
        int j = height.length-1;
        // (j-i) * highest point
        while(i < j) {
            lowerPoint = Math.min(height[i], height[j]);

            if(max < (j-i) * lowerPoint) max = (j-i) * lowerPoint;

            if(height[i] > height[j]) j--;
            else lowerPoint = i++;
        }
        return max;
    }
}
