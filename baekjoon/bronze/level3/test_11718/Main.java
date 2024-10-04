package bronze.level3.test_11718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        while (input != null) {
            bw.write(input + "\n");
            input = br.readLine();
        }
        bw.close();
    }
}
