import java.util.Scanner;

public class Game {

    private Player player;

    private GameMap gameMap;

    private String[] foundWords;



    public Game() {
        player = new Player();
        gameMap = new GameMap();
        foundWords = new String[GameMap.WORDS_COUNT];
    }

    public void play() {

        while (!gameOver()){

            gameMap.drawGrid();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please, enter word: ");

            String playerInput = scanner.nextLine();

            boolean found = gameMap.checkWord(playerInput);
                if (found) {
                    System.out.println("Congratulation!!! You found word!!!");
                } else {
                    System.out.println("Sorry, this word is not found! Please, try again...");
                }

        }


    }

    public boolean gameOver() {
        return false;
    }
}
