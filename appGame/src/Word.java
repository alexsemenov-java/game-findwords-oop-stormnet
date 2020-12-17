public class Word {

    private Letter[] allLetters;

    public Word(Letter ... letters) {
        allLetters = letters;
    }

    public Letter[] getAllLetters() {
        return allLetters;
    }

    public boolean isTheSame(String anotherWord) {
        if (anotherWord.length() != allLetters.length) {
            return false;
        }

        for (int i = 0; i < allLetters.length; i++) {
            Letter letter = allLetters[i];
            char anotherLetter = anotherWord.charAt(i);

            if (!letter.isTheSame(anotherLetter)) {
                return false;
            }
        }

        return true;
    }
}
