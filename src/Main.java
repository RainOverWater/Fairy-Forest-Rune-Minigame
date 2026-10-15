import java.util.Scanner;

void main() {

    Scanner scan = new Scanner(System.in);
    String choice = "";

    // ask player if they would like to start the game
    // loop until player chooses a valid answer
    while (choice != "exit") {
        IO.println("Play rune game? yes/no");

        choice = scan.nextLine().toLowerCase();

        switch (choice) {
            case "yes", "y":
                IO.println("Rune game started");
                RuneGame game = new RuneGame();
                game.startRound();
                choice = "exit";
                break;

            case "no", "n":
                IO.println("Ending prompt");
                choice = "exit";
                break;
            default:
                IO.println("Invalid response");
        }
    }
            // Rune Game Task

}
