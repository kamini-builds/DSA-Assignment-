public class BinarytoDecimal {
    static int binaryToDecimal(int n){
        if(n==0) return 0;
        return n%10 + 2*binaryToDecimal(n/10);
    }
    public static void main(String[] args) {
        int n = 1010;
        System.out.println(binaryToDecimal(n));
    }
}
