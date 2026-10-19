public class DecimaltoBinary {
    static int decimalToBinary(int n){
        if(n==0) return 0;
        return n%2 + 10*decimalToBinary(n/2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(decimalToBinary(n));
    }
}
