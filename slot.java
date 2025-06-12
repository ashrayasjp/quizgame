
import java.util.Scanner;
import java.util.Random;

public class slot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 500;
        int bet;

        String[] symbols = {
                "🍒", "🍒", "🍒", "🍒", "🍒",
                "🍉", "🍉", "🍉",
                "🍋", "🍋",
                "🍓",
                "🍎"
        };

        int payoutCherry = 5;
        int payoutWatermelon = 10;
        int payoutLemon = 15;
        int payoutStrawberry = 20;
        int payoutApple = 50;

        System.out.println("Slot Machine");

        System.out.println("Symbols: 🍒 🍉 🍋 🍓 🍎");
        System.out.println("Enter 0 To exit");
        while (balance > 0) {
            System.out.println("\nYour balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet == 0) {
                System.out.println("Thank you for playing! Your final balance is $" + balance);
                break;
            }

            if (bet > balance) {
                System.out.println("Insufficient balance. Try again.");
                continue;
            }

            if (bet < 20) {
                System.out.println("The minimum bet amount is $20");
                continue;
            }

            balance -= bet;

            String[] spinResult = new String[3];
            for (int i = 0; i < 3; i++) {
                int index = random.nextInt(symbols.length);
                spinResult[i] = symbols[index];
            }

            System.out.println("Spinning...");
            System.out.println("---------------------");
            System.out.printf("| %s | %s | %s |\n", spinResult[0], spinResult[1], spinResult[2]);
            System.out.println("---------------------");

            int payout = 0;

            if (spinResult[0].equals(spinResult[1]) && spinResult[1].equals(spinResult[2])) {
                String symbol = spinResult[0];
                switch (symbol) {
                    case "🍒":
                        payout = bet * payoutCherry;
                        break;
                    case "🍉":
                        payout = bet * payoutWatermelon;
                        break;
                    case "🍋":
                        payout = bet * payoutLemon;
                        break;
                    case "🍓":
                        payout = bet * payoutStrawberry;
                        break;
                    case "🍎":
                        payout = bet * payoutApple;
                        break;
                }
                System.out.println("Jackpot... Three " + symbol + "!");
            } else if (spinResult[0].equals(spinResult[1]) ||
                    spinResult[1].equals(spinResult[2]) ||
                    spinResult[0].equals(spinResult[2])) {
                payout = bet * 2;
                System.out.println(" You matched two symbols!");
            } else {
                System.out.println(" Hard luck! Try again");
            }

            balance += payout;

            if (payout > 0) {
                System.out.println("You won: $" + payout);
            }

            if (balance <= 0) {
                System.out.println("Insufficient Balance.");
                break;
            }
        }

        scanner.close();
    }
}
