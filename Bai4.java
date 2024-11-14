package assignment8;

public class Bai4 {
    public static String swapCase(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isUpperCase(c)) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "Hello World";
        System.out.println("Swapped case: " + swapCase(str));
    }
}
