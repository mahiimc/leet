import java.util.Arrays;
public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] res = rearrangeArray(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] rearrangeArray(int[] nums ) {
        int evenIndex = 0;
        int oddIndex = 1;

        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            if(nums[i] > 0 ) {
                result[evenIndex] = nums[i];
                evenIndex+=2;
            }
            else {
                result[oddIndex] = nums[i];
                oddIndex+=2;
            }
        }
        return result;
    }
}