public class FirstAndLastElementOfSortedArray {
    public static void main(String[] args) {
        /** 
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        **/
        int[] nums = {1,1,2};
        int target = 1;

        int[] res = searchRange(nums, target);
        for( int num : res ) {
            System.out.print(num+" ");
        }
    }
    public static int[] searchRange(int[] arr, int target) {
        
        int left = 0;
        int right = arr.length-1;
        int start = -1;
        int end = -1;
        while ( left <= right ) {
            int mid = (left+right)/2;
            if( arr[mid] == target) {
                start = mid;
                while(start - 1 >= 0 && arr[start-1] == target) {
                    start--; 
                }
                end = mid;
                while(end + 1 < arr.length && arr[end+1] == target) {
                    end++;
                }
                break;
            }
            else if(arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid-1;
            }
        }
        return new int[]{start,end};
    }

}