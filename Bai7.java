package assignment8;

public class Bai7 {
    public static String removeExtraSpaces(String s){
        return String.join(" ", s.trim().split("\\s+"));
    }

    public static void main(String[] args) {
        String str = "  Hello   World  ";
        System.out.println("Trimmed string: '" + removeExtraSpaces(str) + "'");
    }
}
