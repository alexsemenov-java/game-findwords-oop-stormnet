public class Word {

    private Letter[] allLetters;

    public Word(Letter ... letters) {
        allLetters = letters;
    }

    public Letter[] getAllLetters() {
        return allLetters;
    }
}
