class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26]; // Frequency array for s1
        int count = s1.length();
        
        // Populate frequency array with characters of s1
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }
        
        int start = 0; // Left boundary of the window
        
        for (int i = 0; i < s2.length(); i++) {
            char rightChar = s2.charAt(i);
            
            // Decrease the count of the current character in the window
            if (freq[rightChar - 'a'] > 0) {
                freq[rightChar - 'a']--;
                count--; // Decrement count as we match one character
            } else {
                // Shrink the window from the left
                while (start < i && s2.charAt(start) != rightChar) {
                    freq[s2.charAt(start) - 'a']++;
                    count++;
                    start++;
                }
                start++; // Move start past the character that caused the conflict
            }
            
            // Check if we have a valid permutation
            if (count == 0) {
                return true;
            }
        }
        
        return false;
    }
}
