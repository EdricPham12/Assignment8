package assignment8;

public class Bai1 {
        public static int countOccurrences(String str, char c){
        int n = 0;
        for (char ch : str.toCharArray()) if (ch == c) n++;
        return n;
    }
        public static void main(String[] args){
        String str = "hello world";
        char c = 'o';
        System.out.println("Character '" + c + "' appears " + countOccurrences(str, c) + " times in '" + str + "'.");
    }
}
