public class MaximumElement {
    static int maxElement(int arr[], int n){
        if(n==1) return arr[0];
        return Math.max(arr[n-1], maxElement(arr, n-1));
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println("Maximum element in the array is: " + maxElement(arr, n));
    }
}
