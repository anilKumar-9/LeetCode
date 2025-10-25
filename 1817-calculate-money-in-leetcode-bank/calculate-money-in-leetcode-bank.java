class Solution {
    public int totalMoney(int n) {
        int[] base = {1, 2, 3, 4, 5, 6, 7};
        int result = 0;
        for (int i = 0; i < n; i++) {
            int week = i / 7;
            int day = i % 7;
            result += base[day] + week;
        }
        return result;
    }
}