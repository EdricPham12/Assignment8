package assignment8;

public class Bai8 {
    public static String findLongestWord(String s) {
        String[] words = s.trim().split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String str = "I love programming";
        System.out.println("Longest word: " + findLongestWord(str));
    }
}
