package Classes;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import Helpers.WordsHelper;

/**
 *
 * @author Marine V
 */
public class Hangman {

    private final String[] dictionary = {
        "byte", "hardware", "software", "bluetooth", "mouse", "troll", "Worm", "cookies", "podcast", "newbie", "computer", "thunking", "dword", "dumbphone", "scrum", "blob"
    };

    //attributes
    private final String secretWord;
    private final int fails;
    private final int tries;
    private final HashSet<Character> proposedLetters;
    private final HashSet<Character> foundLetters;
    private final boolean hanged;
    private final boolean found;
    // private boolean debug; // a debug mode to display the word to find
    private final int MAX_FAILS = 7;

    //constructors
    public Hangman() {
        //attributes initialization
        secretWord = "";
        fails = 0;
        tries = 0;
        proposedLetters = new HashSet<>();
        foundLetters = new HashSet<>();
        hanged = false;
        found = false;
    }

    //methods
    private String getRandomWord() {
        Random random = new Random(); // use of Random class
        int randomline = random.nextInt(16 - 1 + 1) + 1;
        String myWord = dictionary[randomline]; // search for the line number "random"
        return myWord;
    }

    private char askForLetter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a letter: ");
        char choosedLetter = sc.nextLine().charAt(0);
        WordsHelper.validAlphabet(choosedLetter);

        return choosedLetter;
    }

//    private String checkLetter(char letter) {
//
//    }
//
//    private void makeWordToShow() {
//
//    }
//
//    private boolean checkFound() {
//
//    }
    public void play() {
        System.out.println(getRandomWord());
    }

}
