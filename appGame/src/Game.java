import java.util.Scanner;

public class Game {

    private Player player;

    private GameMap gameMap;

    private GameResult gameResult;

    public Game() {
        player = new Player();
        gameMap = new GameMap();
        gameResult = new GameResult();

    }

    public void play() {

        while (!gameOver()){

            gameMap.drawGrid();


            System.out.println("Please, enter word: ");


            String playerInput = player.makeMove();
            boolean found = gameMap.checkWord(playerInput);
            if (found) {
                    System.out.println("Congratulation!!! You found word!!!");

                    gameResult.addFoundWord(playerInput);
                    gameResult.drawResults();

                } else {
                    System.out.println("Sorry, this word is not found! Please, try again...");
            }
        }
    }

    public boolean gameOver() {
        return false;
    }
}
