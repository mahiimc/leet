import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicatesII {
    public static void main(String[] args) {
        // int[] nums = {1,2,3,1};
        int[] nums = {1,0,1,1};
        // int[] nums = {99,99};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            if (map.containsKey(num) && Math.abs(map.get(num) - i) <= k ) {
                return true;
            }
            map.put(num, i);
       }
       return false;
    }
}