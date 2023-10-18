import java.util.HashSet;
import java.util.Set;

public class NumberOfArithmeticTriplets {

    public static void main(String[] args) {
       int[] nums = {0,1,4,6,7,10};
       int result = arithmeticTriplets(nums, 3); 
       System.out.println(result);
    }


    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
        
            if(set.contains(nums[i]- (diff * 1)) && set.contains(nums[i]- (diff * 2))) {
                count++;
            }
            set.add(nums[i]);
            
        }
        return count;
    }
    
}
