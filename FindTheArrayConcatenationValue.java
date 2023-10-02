public class FindTheArrayConcatenationValue {


    public static void main(String[] args) {
        int[] nums = {7,52,2,4};
        long result = findTheArrayConcVal(nums);
        System.out.println(result);
    }

    public static long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        long result = 0;

        while( left < right ) {
            result+=Long.valueOf(String.valueOf(nums[left]).concat(String.valueOf(nums[right])));
            left++;
            right--;
        }
        if(left == right) {
            result+=nums[right];
        } 
        return result;
    }
    
}
