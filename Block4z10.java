public class Block4z10 {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        int attempts = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int x = -1;

        while (x != randomNum) {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            attempts++;

            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it's " + randomNum);
            }
            }

        System.out.println("You guessed it in " + attempts + " attempts.");
        }

    }
