import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsSumLessThanTarget {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1,1,2,3,1);
        System.out.println(countPairs(nums, 2));
    }

    public static int countPairs(List<Integer> nums, int target) {
            // return brute(nums,target);
            return twoPointer(nums,target);
    }


    public static int twoPointer(List<Integer> nums , int target) {
        Collections.sort(nums);
        
        if(nums.size() == 1) {
            return 0;
        }
        int count = 0;
        int left = 0;
        int right = nums.size()-1;
        while( left <= right ) {
            if(nums.get(left) + nums.get(right) < target) {
                count = count + (right-left);
                left++;
            }
            else {
                right--;
            }

        }
        return count;
    }

    public static int brute(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int n = nums.size();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        } 
        return count; 
    }
}
