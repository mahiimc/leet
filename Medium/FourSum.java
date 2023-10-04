import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        // find quadruplets which sums upto given target
        int[] nums = { 1000000000,1000000000,1000000000,1000000000 };
        // -2 -1 0 0 1 2 
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        for (List<Integer> res : result) {
            System.out.println(res);
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalRes = new ArrayList<>();
        Arrays.sort(nums);
       
        if(nums.length == 4) {
            if( (long) nums[0] + (long) nums[1] + (long) nums[2] + (long) nums[3] != target ) {
                return finalRes;
            }
        }
        
         for(int i=0;i<nums.length-3;i++) {
             for(int j=i+1;j<nums.length-2;j++) {
                 int start = j+1;
                 int end = nums.length-1;
                 long remaining = target - ((long) nums[i] + (long) nums[j]);
                 while(start < end ) {
                     long sum = (long) nums[start] + (long) nums[end];
                     if ( remaining == sum ) {
                         List<Integer> quad = Arrays.asList(nums[i],nums[j],nums[start],nums[end]);
                         if(!finalRes.contains(quad)) {
                             finalRes.add(quad);
                         }
                         start++;
                         end--;
 
                         while(start < end && nums[start] == nums[start-1]) start++;
                         while(start < end && nums[end] == nums[end+1]) end--;
                     }
                     else  if ( sum < remaining ) {
                         start++;
                     }
                     else {
                         end--;
                     }
                 }
             }
         }
         return finalRes;
    }
}
