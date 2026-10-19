public class ProductofDigits {
    static int POD(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return POD(n/10) * n%10;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Product of digits: " + POD(n));
    }
}
