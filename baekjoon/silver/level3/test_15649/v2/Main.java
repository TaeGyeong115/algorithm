package silver.level3.test_15649.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean[] CHECK;
    private static int N;
    private static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        CHECK = new boolean[N + 1];

        recursion(1, "");
    }

    private static void recursion(int idx, String answer) {
        if (idx == M + 1) {
            System.out.println(answer.trim());
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!CHECK[i]) {
                CHECK[i] = true;
                recursion(idx + 1, answer + i + " ");
                CHECK[i] = false;
            }
        }
    }
}
