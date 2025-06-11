package arrays;

import java.util.Scanner;

public class food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter element %d", (i + 1));
            foods[i] = scanner.nextLine();
            System.out.println(foods[i]);
        }
        scanner.close();
        for (String food : foods) {
            System.out.println(food);
        }

    }

}
