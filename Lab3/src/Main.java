public class Main {
    public static void main (String[] args) {
        Text text1 = new Text( "Open here I flung the shutter. When, with many a flirt and flutter. In there stepped a stately Raven of the saintly days of yore;" );
        System.out.println("Number of sentences: " + text1.getNumberSentences());

        System.out.println("Number of vowels: " + text1.getNumberVowels());
        System.out.println("Number of consonants: " + text1.getNumberConsonants());
        System.out.println("Number of letters: " + text1.getNumberLetters());

        System.out.println("Longest word: " + text1.getLongestWord());
        text1.printMostUsed(10);
    }
}
