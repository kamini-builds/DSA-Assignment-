public class LCMofTwoNumbers {
    static int LCM(int a, int b){
        return (a*b)/GCDOfTwoNumbers.GCD(a, b);
}
public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println("LCM of " + a + " and " + b + " is: " + LCM(a, b));
    }
}
