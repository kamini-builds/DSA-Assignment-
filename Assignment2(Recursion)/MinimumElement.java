public class MinimumElement {
    static int minElement(int arr[], int n){
        if(n==1) return arr[0];
        return Math.min(arr[n-1], minElement(arr, n-1));
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Minimum element in the array is: " + minElement(arr, n));
    }
}
