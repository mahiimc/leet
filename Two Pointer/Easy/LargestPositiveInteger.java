import java.util.HashSet;
import java.util.Set;

public class LargestPositiveInteger {

    public static void main(String[] args) {
        int[] nums = {-10,8,6,7,-2,-3};
        int max = findMax(nums);
        System.out.println(max);
    }

    public static int findMax(int[] nums) {
        Set<Integer> set  = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(set.contains(-(nums[i]))) {
                max = Math.max(Math.abs(nums[i]),max);
            }
            set.add(nums[i]);
        }
        return max;
    }
    
}
