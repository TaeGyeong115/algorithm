package silver.level5.test_5635;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Person senior = null;
        Person junior = null;
        for (int i = 0; i < n; i++) {
            String[] arr = sc.nextLine().split(" ");
            LocalDate date = LocalDate.of(Integer.parseInt(arr[3]), Integer.parseInt(arr[2]), Integer.parseInt(arr[1]));

            if (i == 0) {
                senior = new Person(arr);
                junior = new Person(arr);
            } else if (senior.getDate().isBefore(date)) {
                senior = new Person(arr);
            } else if (junior.getDate().isAfter(date)) {
                junior = new Person(arr);
            }
        }

        System.out.println(senior.getName());
        System.out.println(junior.getName());
    }
}


class Person {
    private final String name;
    private final LocalDate date;

    public Person(String[] input) {
        this.name = input[0];
        this.date = LocalDate.of(Integer.parseInt(input[3]), Integer.parseInt(input[2]), Integer.parseInt(input[1]));
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
