package bronze4.test_15552;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            bw.write(Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "\n");
        }

        bw.close();
    }
}
