package wc;

public class WordCounter {
	public int countTotalWords(String content) {
        // Use the String class to remove punctuation and digits, then split the content into individual words
        content = content.replaceAll("[\\p{P}\\p{S}]", "").replaceAll("\\d", "");
        String[] words = content.split("\\s+");

        // Return the total number of words
        return words.length;
	}
}
