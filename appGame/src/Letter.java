public class Letter {

    private String symbol;

    private int row;

    private int col;

    public Letter(String s, int r, int c) {
        this.symbol = s;
        this.row = r;
        this.col = c;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isTheSame(char anotherSymbol) {
        char mySymbol = symbol.charAt(0);
        return mySymbol == anotherSymbol;
    }
}
