// Java implementation of iterative Binary Search
public class binarysearch {
    int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;
 		// element is present at mid
            if (arr[mid] == x) {
                return mid;
            // If element is smaller than mid
            } else if (arr[mid] > x) {
                r = mid - 1;
            // element present in right subarray
            } else {
              l = mid + 1;
            }  
        }
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        binarysearch ob = new binarysearch();
 
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}
