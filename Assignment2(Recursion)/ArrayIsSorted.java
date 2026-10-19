public class ArrayIsSorted {
    static boolean isSorted(int arr[], int n){
        if(n==1 || n==0) return true;
        if(arr[n-1]<arr[n-2]) return false;
        return isSorted(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        if(isSorted(arr, n)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
