class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    int rowCount = 0;
                    int colCount = 0;
                    for (int k = 0; k < n; k++) {
                        rowCount += mat[i][k];
                    }
                    for (int k = 0; k < m; k++) {
                        colCount += mat[k][j];
                    }
                    if (rowCount == 1 && colCount == 1) {
                        count++;
                    }
                }
            }
        }
        return count; 
    }
}