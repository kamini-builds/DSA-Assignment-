import java.util.*;
public class FibonacciSeries {
    static int FIB(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return FIB(n-1) + FIB(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(FIB(i) + " ");
        }
        sc.close();
    }
}