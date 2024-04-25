class Solution {
    // Identify vowels
    static boolean isVowel(char c) {
    return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U');
    }

    public String reverseVowels(String s) {
        
        // Identify length of the given string
        int len = s.length();

        // Store the vowels separately
        char[] str = s.toCharArray();

        // Create array to store vowels in
        ArrayList<Integer> vowels = new ArrayList<>();

        // Loop through string to store the vowels
        for (int i = 0; i < len; i++) {
            // If the character is a vowel
            if (isVowel(str[i])) {
                // Add vowel to string
                vowels.add(i);
            }
        }

        // Identify the size of vowels
        int vSize = vowels.size();

        // Place the vowels in the reverse order
        for (int i = 0; i < vSize / 2; i++) {

            // Swap the vowels
            // Get the first vowel
            int firstV = vowels.get(i);

            // Get the second vowel
            int lastV = vowels.get(vSize - 1 - i);

            // Store the first vowel
            char temp = str[firstV];

            // Place the last vowel in the position of the first one
            str[firstV] = str[lastV];

            // Store the first value in the position of the last one
            str[lastV] = temp;
        }
        
        // Return the result
        return String.valueOf(str);
    }
}