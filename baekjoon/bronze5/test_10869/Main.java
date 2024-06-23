package bronze5.test_10869;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        bw.write((a + b) + "\n");
        bw.write((a - b) + "\n");
        bw.write((a * b) + "\n");
        bw.write((a / b) + "\n");
        bw.write(String.valueOf(a % b));

        bw.close();
    }
}
