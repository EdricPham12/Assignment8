package assignment8;

public class Bai6 {
    public static int countWords(String s){
        return s.trim().split("\\s+").length;
    }
    public static void main(String[] args){
        String str = "Java is fun";
        System.out.println("Number of words: " + countWords(str));
    }
}
