import java.util.*;

class PrintNumbersFrom1toN {
     static void PrintIncreasing(int n){
        if(n==0){
            return;
        }
        PrintIncreasing(n-1);
        System.out.print(n + " ");
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        PrintIncreasing(n);
    }
}
