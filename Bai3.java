package assignment8;

public class Bai3 {
    public static boolean isPalindrome(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static void main(String[] args){
        String str1 = "madam";
        String str2 = "Hello";
        System.out.println("Is '" + str1 + "' a palindrome? " + isPalindrome(str1));
        System.out.println("Is '" + str2 + "' a palindrome? " + isPalindrome(str2));
    }
}
