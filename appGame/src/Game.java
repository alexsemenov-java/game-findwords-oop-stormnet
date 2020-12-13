public class Game {

    private Player player;

    private GameMap gameMap;

    public Game() {
        player = new Player();
        gameMap = new GameMap();
    }

    public void start() {


    }

    public boolean gameOver() {
        return true;
    }
}
