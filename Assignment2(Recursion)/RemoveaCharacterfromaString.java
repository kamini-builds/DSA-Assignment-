public class RemoveaCharacterfromaString {
    static String removeChar(String str, char ch) {
        if (str.length() == 0) {
            return str;
        }
        if (str.charAt(0) == ch) {
            return removeChar(str.substring(1), ch);
        } 
            return str.charAt(0) + removeChar(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        System.out.println(removeChar(str, ch));
    }
}
