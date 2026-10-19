public class LinearSearch {
    static int linearSearch(int arr[], int n, int x){
        if(n==0) return -1;
        if(arr[n-1]==x) return n-1;
        return linearSearch(arr, n-1, x);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int x = 3;
        int result = linearSearch(arr, n, x);
        if(result==-1){
            System.out.println("Element not found in the array");
        }else{
            System.out.println("Element found at index: " + result);
        }
    }
}
