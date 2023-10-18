import java.util.Arrays;

public class SquaresOfSortedArray {
    
    public static void main(String[] args) {
       int[] nums = {-4,-1,0,3,10};
       int[] res = sortedSquares(nums); 
       for(int num : res) {
        System.out.print(num+" ");
       }
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
