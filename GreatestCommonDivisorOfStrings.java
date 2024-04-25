class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        // To store the final string
        StringBuilder result = new StringBuilder();

        // Create variable lengths for the strings
        int s1 = str1.length();
        int s2 = str2.length();

        // If str1 length is less trhan str2 then recur using the greatest common divisor
        if (s1 < s2) {
            return gcdOfStrings(str2, str1);
        }

        // If str1 is not the concatenation of str2
        else if (!str1.startsWith(str2)) {
            return "";
        }

        // If str2 is empty
        else if (str2.isEmpty()) {
            return str1;
        }

        // Otherwise take the common prefix and recur
        else {
            // Identify substring
            String gcd = str1.substring(s2);
            // Return largest string 
            return gcdOfStrings(gcd, str2);
        }

    }
}