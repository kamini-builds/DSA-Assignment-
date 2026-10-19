public class ReplaceaCharacterinaString {
    static String replaceChar(String str, char a, char b){
        if(str.length()==0) return str;
        if(str.charAt(0)==a){
            return b + replaceChar(str.substring(1), a, b);
        }
        else{
            return str.charAt(0) + replaceChar(str.substring(1), a, b);
        }
    }
    public static void main(String[] args) {
        String str = "hello world";
        char a = 'o';
        char b = 'x';
        System.out.println(replaceChar(str, a, b));
    }
}
