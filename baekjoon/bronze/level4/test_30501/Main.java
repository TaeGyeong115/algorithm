package bronze.level4.test_30501;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (name.contains("S")) {
                System.out.print(name);
            }
        }
    }
}
