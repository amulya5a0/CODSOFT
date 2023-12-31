import java.util.*;

class NumberGame {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int maxRounds = 3;
        int maxAttempts = 5;

        int totalAttempts = 0;
        int totalRounds = 0;
        int totalScore = 0;

        for (int round = 1; round <= maxRounds; round++) {
            RoundResult result = playRound(maxAttempts);

            totalAttempts += result.attempts;
            totalRounds++;
            totalScore += result.score;

            System.out.println("Round " + round + " completed");
            System.out.println("Attempts: " + result.attempts);
            System.out.println("Score for this round: " + result.score);
            System.out.println("Total Score: " + totalScore);

            if (round < maxRounds) {
                System.out.println("Do you want to play another round? (y/n): ");
                char playAgainChoice = sc.next().charAt(0);
                if (playAgainChoice != 'y' && playAgainChoice != 'Y') {
                    break;
                }
            }
        }

        System.out.println("Game Over!");
        System.out.println("Total Rounds played: " + totalRounds);
        System.out.println("Total Attempts: " + totalAttempts);
        System.out.println("Overall Total Score: " + totalScore);
        sc.close();
    }

    public static RoundResult playRound(int maxAttempts) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int random = rd.nextInt(100) + 1;

        System.out.println("Welcome to Number Guessing Game!\n");

        while (count < maxAttempts) {
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            count++;

            if (random > guess) {
                System.out.println("Too low");
            } else if (random < guess) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct guess!");
                return new RoundResult(count, maxAttempts - count + 1);
            }
        }

        System.out.println("Out of attempts. The correct number was " + random);
        return new RoundResult(count, 0);
    }
}

class RoundResult {
    int attempts;
    int score;

    public RoundResult(int attempts, int score) {
        this.attempts = attempts;
        this.score = score;
    }
}