class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Create flower counter
        int numFlowers = 0;

        // Iterate through the flowerbed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot and its adjacent plots are empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Plant a flower in the current plot
                flowerbed[i] = 1;
                // Increment the flower count
                numFlowers++;
            }
        }
        
        // Check if the number of planted flowers is greater than or equal to n
        return numFlowers >= n;
    }
}
