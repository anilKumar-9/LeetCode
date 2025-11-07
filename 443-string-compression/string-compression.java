class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) return 1;

        int count = 1;
        int pos = 0;
        int i = 1;

        while (i <= n) {
            // If we reach end or character changes
            if (i == n || chars[i] != chars[i - 1]) {
                chars[pos++] = chars[i - 1];

                if (count > 1) {
                    String val = Integer.toString(count);
                    for (int j = 0; j < val.length(); j++) {
                        chars[pos++] = val.charAt(j);
                    }
                }

                count = 1; // reset for next group
            } else {
                count++;
            }
            i++;
        }

        return pos;
    }
}
