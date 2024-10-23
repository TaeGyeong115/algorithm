package silver.level1.test_2156;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] wine = new int[n + 1];
        long[] dp = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = wine[1];
        if (n >= 2) dp[2] = wine[1] + wine[2];
        if (n >= 3) {
            dp[3] = Math.max(dp[2], Math.max(wine[1] + wine[3], wine[2] + wine[3]));
        }

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 1],
                Math.max(dp[i - 2] + wine[i],
                    dp[i - 3] + wine[i - 1] + wine[i]));
        }

        System.out.print(dp[n]);
    }
}
