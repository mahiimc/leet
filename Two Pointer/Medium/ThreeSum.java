import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {3,0,-2,-1,1,2};
        List<List<Integer>> triplets = threeSum(nums);  
        for(List<Integer> trip : triplets) {
            for( int num : trip ) {
                System.out.print(num+" ");
            }
            System.out.println();
        }  
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            int j = i+1;
            int k = nums.length-1;
            while(j < k ) {
                List<Integer> tripLets =  new ArrayList<>(3);
                int sum = nums[i] + nums[j] + nums[k];
                if( sum == 0 ) {
                    tripLets.add(nums[i]);
                    tripLets.add(nums[j]);
                    tripLets.add(nums[k]);
                    ++j;
                    if(!result.contains(tripLets)) {
                        result.add(tripLets);
                    }
                }
                else if ( sum < 0 )  j++;
                else   k--;
            }
            
        }

        return result;
    }
}