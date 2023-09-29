import java.util.Arrays;

public class CheckIfNAndItsDoubleExists {


    public static void main(String[] args) {
        int[] nums = {10,2,5,3};
        boolean result =  checkIfExist(nums);
        System.out.println(result);
    }


   public static boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++) {
           int target = arr[i] * 2;
           int result = binarySearch(arr,target);
           if(result != -1 && result != i) {
               return true;
           }
       }
       return false;
    }

    public static int binarySearch(int[] arr, int target) {
        int  left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = (left+right)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;

    } 
}
