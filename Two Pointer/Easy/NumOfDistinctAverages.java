import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumOfDistinctAverages {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        int count = distinctAverages(nums);
        System.out.println(count);
    }

    public static int distinctAverages(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        while ( left < right ) {
            set.add((nums[left] + nums[right]));
            left++;
            right--;
        }
        return set.size();
    }
}
