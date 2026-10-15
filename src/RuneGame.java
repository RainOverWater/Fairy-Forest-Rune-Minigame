import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class RuneGame extends Task {
    private List<Rune> runes;
    private int roundTime = 90;
    private String instructions = "";
    private Rune selectedRune;

    public RuneGame() {
        runes = new ArrayList<>();
        runes.add(new Rune("runeA", "file path"));
        runes.add(new Rune("runeB", "file path"));
        runes.add(new Rune("runeC", "file path"));
        runes.add(new Rune("runeD", "file path"));
        runes.add(new Rune("runeE", "file path"));
    }
    Random random = new Random();

    //import timer things

    // Game repeats after checkRune
    // Need checkRune

    // player earns a point or no point

    //look into make runes clickable

    //doesn't show anything yet. text placeholders

    public void startRound() {

        // picks one random rune from all the runes in the game
        Rune selectedRune = runes.get(random.nextInt(runes.size()));

        // makes a new list for the options the player can click(?)
        List<Rune> runeOptions = new ArrayList<>();

        // make sure one of the options is the 1st rune selected
        runeOptions.add(selectedRune);

        // add the other runes the player can choose from
        while (runeOptions.size() < 5) {
            Rune randomRune = runes.get(random.nextInt(runes.size()));

            if (!runeOptions.contains(randomRune)) {
                runeOptions.add(randomRune);
            }
        }

        // shuffle so the selectedRune isn't in the same place every time
        Collections.shuffle(runeOptions);
    }
    // chosenRune is the rune the player selects as their guess
    public void checkRune (Rune chosenRune) {

        if (chosenRune.getID() == selectedRune.getID()) {
    IO.println("Player selected the correct rune");
        }
        else {
            IO.println("Wrong rune selected");
        }
        // clear screen or maybe put this under startRound idk yet

        startRound();


    }
}
