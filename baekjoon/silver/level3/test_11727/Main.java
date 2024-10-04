package silver.level3.test_11727;

import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = (dp[i - 1] * 2 + 1) % 10_007;
            } else {
                dp[i] = (dp[i - 1] * 2 - 1) % 10_007;
            }
        }

        bw.write(String.valueOf(dp[n]));
        bw.close();
    }
}
