package silver.level5.test_9655;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.print(N % 2 == 1 ? "SK" : "CY");
    }
}
