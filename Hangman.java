import java.util.ArrayList;

public class Hangman {
    public static void main(String[] args) {
        String codeword = "blind";
        ArrayList<Character> guesses = new ArrayList<Character>();
        int lives = 6;
        displayGameGrid(codeword, guesses, lives);

    }

    public static void displayGameGrid(String codeWord, ArrayList<Character> guesses, int lives) {
        System.out.println("this is the grid");
        System.out.println("This is the codeword " + codeWord);
        System.out.println("______");
        System.out.println("|     O");
        System.out.println("|   --|--");
        System.out.println("|    / \\");
        System.out.println("______");
        System.out.println("_ _ _ _ _");
    }
}
