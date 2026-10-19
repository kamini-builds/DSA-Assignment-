 import java.util.*;
 class PrintNumbersFromNto1 {
      static void PrintDecreasing(int n){
         if(n==0){
             return;
         }
         System.out.println(n);
         PrintDecreasing(n-1);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        PrintDecreasing(n);
        sc.close();
    }
}
