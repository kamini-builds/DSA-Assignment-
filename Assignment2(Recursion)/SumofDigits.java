import java.util.Scanner;
public class SumofDigits {
     static int SOD(int n){
        if(n>=0 && n<=9){
        return n;
        }
        return SOD(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of digits: " + SOD(n));
        scanner.close();
    }
}
