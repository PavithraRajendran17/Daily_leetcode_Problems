class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        HashSet<String> visited = new HashSet<>();
        visited.add("0,0");
        for (char ch : path.toCharArray()) {
            if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else { 
                x--;
            }
            String pos = x + "," + y;
            if (visited.contains(pos)) {
                return true;
            }
            visited.add(pos);
        }
        return false;
    }
}