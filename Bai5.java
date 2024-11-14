package assignment8;

public class Bai5 {
    public static String[] splitWords(String s){
        return s.trim().split("\\s+");
    }
    public static void main(String[] args){
        String str = "Java is fun";
        String[] words = splitWords(str);
        for (String word : words) {
            System.out.println(word);
        }
    }
}