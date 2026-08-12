// Last updated: 8/12/2026, 11:36:25 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiagonal = 0;
        int maxArea = 0;

        for (int[] d : dimensions) {

            int length = d[0];
            int width = d[1];

            int diagonal =
                length * length + width * width;

            int area = length * width;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
            else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}