package bronze.level1.test_2309.java.v3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarf = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);

        int[] xDwarf = new int[2];
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if ((sum - dwarf[i] - dwarf[j]) == 100) {
                    xDwarf[0] = i;
                    xDwarf[1] = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != xDwarf[0] && i != xDwarf[1]) {
                System.out.println(dwarf[i]);
            }
        }
    }
}
