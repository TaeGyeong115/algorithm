package silver.level3.test_15650.v3;

import java.util.Scanner;

public class Main {
    private static int N;
    private static int M;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N + 1];

        dfs(0, 1, new StringBuilder());
    }

    private static void dfs(int idx, int start, StringBuilder sb) {
        if (idx == M) {
            System.out.println(sb.toString().trim());
            return;
        }

        for (int i = start; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(i).append(" ");
                dfs(idx + 1, i + 1, sb);
                sb.delete(sb.length() - 2, sb.length());
                visited[i] = false;
            }
        }
    }
}
