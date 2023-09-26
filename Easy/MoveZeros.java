public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,12};
        moveZeroes(nums);
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
       
        int index = 0;
        for(int num : nums) {
            if ( num != 0 ) {
                nums[index++] = num;
            }
        }
        while(index < nums.length) {
            nums[index++] = 0;
        }
    }
}
