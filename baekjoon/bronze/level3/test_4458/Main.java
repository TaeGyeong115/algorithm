package bronze.level3.test_4458;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String first = String.valueOf(input.charAt(0)).toUpperCase();
            System.out.println(first + input.substring(1));
        }
    }
}
