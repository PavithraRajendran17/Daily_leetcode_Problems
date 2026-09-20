class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
           for (int i = 0; i < arr.length; ) {
            boolean found = false;

            for (int[] piece : pieces) {
                if (piece[0] == arr[i]) {
                    found = true;

                    for (int j = 0; j < piece.length; j++) {
                        if (i + j >= arr.length || arr[i + j] != piece[j]) {
                            return false;
                        }
                    }

                    i += piece.length;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}