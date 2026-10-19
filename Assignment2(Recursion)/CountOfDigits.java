import java.util.*;
public class CountOfDigits {
     static int COD(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return COD(n/10) + 1;
    }   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Count of digits: " + COD(n));
        }
    }          
}
