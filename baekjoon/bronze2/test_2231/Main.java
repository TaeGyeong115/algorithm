package bronze2.test_2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 1; i <= n; i++){
            char[] c = String.valueOf(i).toCharArray();
            int sum = 0;
            for (int j = 0; j < c.length; j++){
                sum += Integer.parseInt(String.valueOf(c[j]));
            }

            if (n == sum + i) {
                result = n - sum;
                break;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
