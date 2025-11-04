class Solution {
    public boolean isValidSudoku(char[][] mat) {
        int[][] rows = new int[10][10];
        int[][] cols = new int[10][10];
        int[][] subMat = new int[10][10];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                // Skip empty cells
                if (mat[i][j] == '.')
                    continue;

                // Current value
                int val = mat[i][j]-'0';

                // Check for duplicates in row
                if (rows[i][val] == 1)
                    return false;

                // Mark as seen
                rows[i][val] = 1;

                // Check for duplicates in column
                if (cols[j][val] == 1)
                    return false;

                // Mark as seen
                cols[j][val] = 1;

                // Check for duplicates in sub-grid
                int idx = (i / 3) * 3 + j / 3;
                if (subMat[idx][val] == 1)
                    return false;

                // Mark as seen
                subMat[idx][val] = 1;
            }
        }
        return true;
    }
}