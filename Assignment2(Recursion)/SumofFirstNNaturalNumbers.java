 import java.util.*;
 public class SumofFirstNNaturalNumbers {
    static int Sum(int n){
        if(n==0) return 0;
         return n + Sum(n-1);
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(Sum(n));
        sc.close();
    }
}
