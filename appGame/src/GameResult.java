public class GameResult {

    private String[] foundWords;

    private int foundWordCount;

    public GameResult() {
        foundWords = new String[GameMap.WORDS_COUNT];
        foundWordCount = 0;
    }

    public void addFoundWord(String word) {
        foundWords[foundWordCount] = word;
        foundWordCount++;
    }

    public void drawResults() {
        System.out.println("***************************************");
        System.out.println("Previously found word: ");

        for (int i = 0; i < foundWordCount; i++) {
            String w = foundWords[i];
            System.out.println(w);
        }

        System.out.println("***************************************");
        System.out.println();
    }

    public boolean isGameOver() {
        return foundWordCount == GameMap.WORDS_COUNT;
    }
}
