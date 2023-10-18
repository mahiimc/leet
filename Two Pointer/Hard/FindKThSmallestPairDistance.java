import java.util.ArrayList;
import java.util.List;

public class FindKThSmallestPairDistance {

    public static void main(String[] args) {
        int[] nums = {62,100,4};
        int k = 2;
        int result = smallestDistancePair(nums, k);
        System.out.println(result);
    }

    public static int smallestDistancePair(int[] nums , int k ) {
        return bruteForce(nums, k);
    }


    public static int bruteForce(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if( i != j ) {
                    int diff = Math.abs(nums[i] - nums[j]);
                    list.add(diff);
                }
            }
        }
        return list.get(k-1);
    }
}
