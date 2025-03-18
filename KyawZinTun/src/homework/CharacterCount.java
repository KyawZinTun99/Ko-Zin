package homework;
public class CharacterCount {

    public static void countCharacterInWord(String word, char charToCount) {
        int count = 0;

        // Loop through each character in the word
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == charToCount) {
                count++;
            }
        }

        // Print the result
        System.out.println("The character '" + charToCount + "' appears " + count + " times in the word \"" + word + "\".");
    }

    public static void main(String[] args) {
        String word = "xylophone";  // The word to count occurrences of 'o'
        char charToCount = 'o';  // The character to count

        countCharacterInWord(word, charToCount);  // Call the method
    }
}
