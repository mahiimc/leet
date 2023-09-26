public class SingleNumberIII {
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,2,5};
        int [] sol = singleNumber(nums);
        for( int num : sol ) {
            System.out.print(num+" ");
        }
    } 

    public static int[] singleNumber(int[] nums) {
        int num = 0;
        for(int i=0;i<nums.length;i++) {
            num = num ^ nums[i];
        }
        return new int[]{num};
    }
}