public class GameMap {

    public static final int WORDS_COUNT = 11;
    private Word[] allWords;

    private String[][] grid;

    public GameMap() {

        grid = new String[8][8];

        allWords = new Word[WORDS_COUNT];

        Word w1 = new Word(new Letter("т", 6, 1),
                           new Letter("а", 5, 1),
                           new Letter("к", 4, 1),
                           new Letter("с", 3, 1),
                           new Letter("и", 2, 1),
                           new Letter("с", 1, 1),
                           new Letter("т", 1, 2)
        );

        allWords[0] = w1;

        Word w2 = new Word(new Letter("з", 3, 2),
                           new Letter("о", 2, 2),
                           new Letter("о", 2, 3),
                           new Letter("л", 1, 3),
                           new Letter("о", 1, 4),
                           new Letter("г", 2, 4));

        allWords[1] = w2;

        Word w3 = new Word(new Letter("ю", 1, 5),
                           new Letter("р", 1, 6),
                           new Letter("и", 1, 7),
                           new Letter("с", 1, 8),
                           new Letter("т", 2, 8));

        allWords[2] = w3;

        Word w4 = new Word(new Letter("п", 3, 8),
                           new Letter("е", 3, 7),
                           new Letter("к", 3, 6),
                           new Letter("а", 3, 5),
                           new Letter("р", 3, 4),
                           new Letter("ь", 3, 3));

        allWords[3] = w4;

        Word w5 = new Word(new Letter("а", 4, 5),
                           new Letter("к", 4, 6),
                           new Letter("у", 4, 7),
                           new Letter("ш", 4, 8),
                           new Letter("е", 5, 8),
                           new Letter("р", 6, 8));

        allWords[4] = w5;


        Word w6 = new Word(new Letter("е", 5, 7),
                           new Letter("г", 5, 6),
                           new Letter("е", 6, 6),
                           new Letter("р", 7, 6),
                           new Letter("ь", 8, 6));

        allWords[5] = w6;

        Word w7 = new Word(new Letter("м", 6, 7),
                           new Letter("а", 7, 7),
                           new Letter("л", 8, 7),
                           new Letter("я", 8, 8),
                           new Letter("р", 7, 8));

        allWords[6] = w7;

        Word w8 = new Word(new Letter("б", 4, 3),
                           new Letter("р", 4, 4),
                           new Letter("о", 5, 4),
                           new Letter("к", 6, 4),
                           new Letter("е", 6, 5),
                           new Letter("р", 5, 5));

        allWords[7] = w8;

        Word w9 = new Word(new Letter("с", 8, 5),
                           new Letter("а", 7, 5),
                           new Letter("д", 7, 4),
                           new Letter("о", 7, 3),
                           new Letter("в", 6, 3),
                           new Letter("н", 5, 3),
                           new Letter("и", 5, 2),
                           new Letter("к", 4, 2));

        allWords[8] = w9;

        Word w10 = new Word(new Letter("и", 8, 4),
                            new Letter("с", 8, 3),
                            new Letter("т", 8, 2),
                            new Letter("о", 8, 1),
                            new Letter("р", 7, 1),
                            new Letter("и", 7, 2),
                            new Letter("к", 6, 2));

        allWords[9] = w10;

        Word w11 = new Word(new Letter("м", 2, 5),
                            new Letter("э", 2, 6),
                            new Letter("р", 2, 7));

        allWords[10] = w11;

    }

    public void drawGrid() {

        for (Word word : allWords) {
            Letter[] allLetters = word.getAllLetters();

            for (Letter letter : allLetters) {
                int row = letter.getRow();
                int col = letter.getCol();

                String symbol = letter.getSymbol();

                if (word.isFound()) {
                    symbol = "*";
                }

                grid[row - 1][col - 1] = symbol;

            }
        }

        System.out.println("  1  2  3  4  5  6  7  8");

        for (int i = 0; i < grid.length ; i++) {
            String[] gridRow = grid[i];

            System.out.print("" + (i + 1) + " ");

            for (int j = 0; j < gridRow.length; j++) {
                System.out.print(grid[i][j] + "  ");
            }

            System.out.println("");
        }
    }

    public boolean checkWord(String playerWord){
        for (Word word : allWords) {
            if (word.isTheSame(playerWord)) {

                word.checkAsFound();
                return true;
            }
        }
        return false;
    }
}
