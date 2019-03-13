/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author marin
 */
public class Hangman {

    private String[] dictionary = {
        "byte", "hardware", "software", "bluetooth", "mouse", "troll", "Worm", "cookies", "podcast", "newbie", "computer", "thunking", "dword", "dumbphone", "scrum", "blob"
    };

    //attributes
    private String secretWord;
    private int fails;
    private int tries;
    private HashSet<Character> proposedLetters;
    private HashSet<Character> foundLetters;
    private boolean hanged;
    private boolean found;
    // private boolean debug; // a debug mode to display the word to find
    private int MAX_FAILS = 7;

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

//    private char askForLetter() {
//
//    }
//
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