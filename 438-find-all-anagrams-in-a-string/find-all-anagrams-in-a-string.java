class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int sLength = s.length();
        int pLength = p.length();
        if(sLength<pLength)
        {
            return result;
        }

        // Step 1: Frequency arrays for pattern 'p' and current window in 's'
        int[] pFreq = new int[26]; // Frequency of characters in p
        int[] sFreq = new int[26]; // Frequency of characters in current window of s

        // Step 2: Fill the frequency for p and the first window of s
        for (int i = 0; i < pLength; i++) {
            pFreq[p.charAt(i) - 'a']++;
            sFreq[s.charAt(i) - 'a']++;
        }

        // Step 3: Start sliding the window over s
        for (int i = 0; i <= sLength - pLength; i++) {
            // If both frequency arrays match, it's an anagram
            if (Arrays.equals(pFreq, sFreq)) {
                result.add(i);
            }

            // Step 4: Slide the window
            if (i + pLength < sLength) {
                sFreq[s.charAt(i) - 'a']--; // Remove the character going out of the window
                sFreq[s.charAt(i + pLength) - 'a']++; // Add the character coming into the window
            }
        }

        return result;
    }
}