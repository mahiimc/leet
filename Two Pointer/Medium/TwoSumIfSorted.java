import java.util.Arrays;

public class TwoSumIfSorted {
    public static void main(String[] args) {
        /* 
        int[] numbers = {2,7,11,15};
        int target = 9;
        */
        int[] numbers = {2,3,4};
        int target = 6;
        
        int[] res = twoSum(numbers, target);
        System.out.println(Arrays.toString(res));
    }
    public static int[] twoSum(int[] numbers , int target ){
        int left = 0;
        int right = numbers.length-1;
        while(left < right ) {
            int sum = numbers[left]  + numbers[right];
            if(sum == target) {
                return new int[]{left+1,right+1}; 
            }
            else if( sum > target ) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }

   

}