package arrays;

import java.util.Scanner;

public class arraynos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = { 4, 2, 8, 9, 5 };
        boolean match = false;
        System.out.println("please enter your number: ");
        int search = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < numbers.length; i++) {
            if (search == numbers[i]) {
                System.out.printf("The number is found : %d", numbers[i]);
                match = true;
                break;
            }
        }
        if (!match) {
            System.out.println("Search element missing");
        }
    }
}
