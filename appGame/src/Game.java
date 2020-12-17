import java.util.Scanner;

public class Game {

    private Player player;

    private GameMap gameMap;

    public Game() {
        player = new Player();
        gameMap = new GameMap();
    }

    public void play() {

        while (!gameOver()){

            gameMap.drawGrid();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please, enter word: ");

            String playerInput = scanner.nextLine();

        }


    }

    public boolean gameOver() {
        return false;
    }
}
