import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
       int[] nums = {-1,-100,3,99};
       int k = 2;
       rorate(nums, k);
       System.out.println(Arrays.toString(nums));
    }

    public static void rorate(int[] nums , int k ) {
        
        rev(nums,0,nums.length-1);
        rev(nums, 0, k-1);
        rev(nums, k, nums.length-1);

    }


    public static void rev(int[] nums ,int start , int end ) {
        while(start < end ) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end--;
        }
    }


    
}
