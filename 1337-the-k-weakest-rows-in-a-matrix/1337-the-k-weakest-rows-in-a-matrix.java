class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            int soldiers = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    soldiers++;
                }
            }

            list.add(new int[]{soldiers, i});
        }

        Collections.sort(list, (a, b) -> {

            if (a[0] != b[0]) {
                return a[0] - b[0];
            }

            return a[1] - b[1];
        });

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {
            answer[i] = list.get(i)[1];
        }

        return answer;
        
    }
}