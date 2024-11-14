package assignment8;

public class Bai2 {
    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public static void main(String[] args){
        String str = "hello";
        System.out.println("Reversed string: " + reverseString(str));
    }
}
