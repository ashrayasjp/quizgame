package arrays;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] fruits = { "apple", "orange", "mango" };
        Arrays.sort(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
