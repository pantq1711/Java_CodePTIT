import java.util.*;

public class J08029 {
    static int dx[] = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int dy[] = {-1, 1, -2, 2, -2, 2, -1, 1};
    static int res[][] = new int[8][8];
    static int visited[][] = new int[8][8];
    static int x, y, u, v;

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int bfs(int i, int j) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        visited[i][j] = 1;
        while (!q.isEmpty()) {
            Pair top = q.poll();
            if (top.x == u && top.y == v) return res[top.x][top.y];
            for (int k = 0; k < 8; ++k) {
                int i1 = top.x + dx[k], j1 = top.y + dy[k];
                if (i1 >= 0 && i1 < 8 && j1 >= 0 && j1 < 8 && visited[i1][j1] == 0) {
                    visited[i1][j1] = 1;
                    q.add(new Pair(i1, j1));
                    res[i1][j1] = res[top.x][top.y] + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            x = s.charAt(0) - 'a';
            y = s.charAt(1) - '1';
            u = s.charAt(3) - 'a';
            v = s.charAt(4) - '1';
            for (int i = 0; i < 8; i++) {
                Arrays.fill(res[i], 0);
                Arrays.fill(visited[i], 0);
            }
            System.out.println(bfs(x, y));
        }
    }
}