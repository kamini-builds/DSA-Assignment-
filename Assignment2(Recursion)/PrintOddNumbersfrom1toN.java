import java.util.*;
public class PrintOddNumbersfrom1toN {
    static void OddPrint(int n){
        if(n==0) return;

        OddPrint(n-1);
        if(n%2!=0){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        OddPrint(n);
        sc.close();
    }
}
