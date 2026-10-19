
public class ReverseNumber{
static int reverseNumber(int num, int rev){
        if(num==0){
            return rev;
        }
        rev = rev*10 + num%10;
        return reverseNumber(num/10, rev);
    }
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        System.out.println(reverseNumber(num, rev));
    }
}
