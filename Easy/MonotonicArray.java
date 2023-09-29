public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,1,0};
        // int[] nums = {1,1,2};
        System.out.println(isMonotonic(nums));
    }


    public static boolean isMonotonic(int[] nums) {
        if(nums.length == 1) return true;
            int i=0;
            if(nums[i] < nums[nums.length-1]) {
                while(i < nums.length-1) {
                    if(!(nums[i] <= nums[i+1])) {
                        return false;
                    }
                    i++;
                }
            }
            else {
                while(i < nums.length-1) {
                    if(!(nums[i] >= nums[i+1])) {
                        return false;
                    }
                    i++;
                }
            }


        return true;
    }
}