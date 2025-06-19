import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hang {
    public static void main(String[] args) {
        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader read = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = read.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldnt find the file");
        } catch (IOException e) {
            System.out.println("Error");
        }
        Random random = new Random();
        String answer = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrong = 0;
        for (int i = 0; i < answer.length(); i++) {
            wordState.add('_');
        }
        System.out.println(" " + "Hangman" + " ");
        while (wrong < 6) {
            System.out.println(Draw(wrong));
            System.out.print("Word" + " ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("Enter a letter you have guessed");
            char guess = scanner.next().toLowerCase().charAt(0);
            if (answer.indexOf(guess) >= 0) {
                System.out.println("Correct Guess");
                for (int i = 0; i < answer.length(); i++) {
                    if (answer.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                if (!wordState.contains('_')) {
                    System.out.println(Draw(wrong));
                    System.out.println("Congrats");
                    break;
                }
            } else {
                wrong++;
                System.out.println("You are wrong");
            }
        }
        if (wrong >= 6) {
            System.out.println(Draw(wrong));
            System.out.println("You lost !! Get Better");
            System.out.println("Answer: " + answer);
        }
        scanner.close();
    }

    static String Draw(int wrong) {
        return switch (wrong) {
            case 0 -> """

                    """;
            case 1 -> """
                      O
                    """;
            case 2 -> """
                    O
                    |
                     """;
            case 3 -> """
                     O
                    /|
                          """;
            case 4 -> """
                     O
                    /|\\
                          """;
            case 5 -> """
                     O
                    /|\\
                    |
                          """;
            case 6 -> """
                     O
                    /|\\
                    | |
                          """;
            default -> "";
        };
    }
}
