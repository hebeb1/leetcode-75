class Solution {
    public String mergeAlternately(String word1, String word2) {

        // To store the final string
        StringBuilder result = new StringBuilder();

        // Create variables for length of words
        int w1 = word1.length();
        int w2 = word2.length();

        // Loop through the index in the strings
        for (int i = 0; i < w1 || i < w2; i++) {

            // Get the character of the first string if it exists
            if (i < w1) {
                result.append(word1.charAt(i));
            }

            // Get the character of the second string if it exists
            if (i < w2) {
                result.append(word2.charAt(i));
            }
        }

        // Return complete result
        return result.toString();
    }
}