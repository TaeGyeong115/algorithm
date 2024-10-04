package silver.level3.test_2579;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];
        int[] answer = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        answer[1] = arr[1];
        if (n  > 1) {
            answer[2] = arr[1] + arr[2];
        }
        for (int i = 3; i <= n; i++) {
            answer[i] = Math.max(answer[i-2], arr[i-1] + answer[i-3]) + arr[i];
        }

        bw.write(String.valueOf(answer[n]));
        bw.close();
    }
}
