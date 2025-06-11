package arrays;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "Which team won the cricket world cup in year 2003?",
                "Who is the leading goal scorer in fifa world cups?",
                "Who is the director of the Hollywood Classic Movie - Psycho (1960)",
                "Who holds the record for the fastest century in One Day Internationals (ODIs)?",
                "Which country has won the most FIFA World Cups?",
                "What genre is the 1941 film Citizen Kane best known for?",
                "Which cricketer has the most international centuries after Sachin Tendulkar?",
                "Which country hosted the FIFA World Cup in 2018?",
                "Who directed the 1957 Indian classic film 'Pyaasa'?",
                "Who was the captain of Sri Lanka in the 2007 Cricket World Cup final?",
                "Which player holds the record for the most assists in FIFA World Cup history?"
        };

        String[][] options = {
                { "1. West Indies", "2. Australia", "3. England", "4. India" },
                { "1. Lionel Messi", "2. Ronaldo Nazario", "3. Neymar Jr", "4. Miroslav Klose" },
                { "1. Stanley Kubrick", "2. Alfred Hitchcock", "3. Sofia Coppola", "4. David Lynch" },
                { "1. Virat Kohli", "2. Shahid Afridi", "3. AB de Villiers", "4. Chris Gayle" },
                { "1. Germany", "2. Italy", "3. Brazil", "4. Argentina" },
                { "1. Sci-fi", "2. Comedy", "3. Drama", "4. Horror" },
                { "1. Ricky Ponting", "2. Virat Kohli", "3. Jacques Kallis", "4. Kumar Sangakkara" },
                { "1. Brazil", "2. Russia", "3. France", "4. Germany" },
                { "1. Raj Kapoor", "2. Satyajit Ray", "3. Bimal Roy", "4. Guru Dutt" },
                { "1. Mahela Jayawardene", "2. Sanath Jayasuriya", "3. Kumar Sangakkara", "4. Marvan Atapattu" },
                { "1. Pelé", "2. Lionel Messi", "3. Diego Maradona", "4. Thomas Müller" }
        };
        int[] answers = {
                2, // Australia (2003 World Cup winner)
                4, // Miroslav Klose (FIFA World Cup top scorer)
                2, // Alfred Hitchcock (Psycho director)
                3, // AB de Villiers (fastest ODI century)
                3, // Brazil (most World Cup titles)
                3, // Drama (Citizen Kane genre)
                2, // Virat Kohli (most centuries after Tendulkar)
                2, // Russia (hosted FIFA 2018)
                4, // Guru Dutt (director of Pyaasa)
                1, // Mahela Jayawardene (SL 2007 WC captain)
                4 // Thomas Müller (most assists in FIFA World Cup)
        };
        System.out.println(".....   |Quiz|     ...");
        int score = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }
            int selection = scanner.nextInt();
            System.out.println(" ");
            if (selection == answers[i]) {
                System.out.println("Correct answer !");
                System.out.println(".............");
                score++;
            } else {
                System.out.println("Incorrect answer  XXX ");
                System.out.println("The Correct answer : " + options[i][answers[i] - 1]);
                System.out.println(".............");
            }

        }
        System.out.printf("You Scored %d ", score);
        scanner.close();
    }
}
