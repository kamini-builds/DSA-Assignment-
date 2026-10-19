public class CountOccurrencesofaCharacterinaString {
    static int countOccurrences(String str, char ch) {
        if (str.length() == 0) {
            return 0;
        }
        int count = (str.charAt(0) == ch) ? 1 : 0;
        return count + countOccurrences(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        int occurrences = countOccurrences(str, ch);
        System.out.println("The character '" + ch + "' occurs " + occurrences + " times in the string \"" + str + "\".");
    }
}
