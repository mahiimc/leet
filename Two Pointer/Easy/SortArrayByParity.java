public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        for(int num : res) {
            System.out.print(num+" ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {

        if(nums.length == 1) {
            return nums;
        }

        int i=0;
        int j=i+1;
        while(i < j && (j < nums.length) ) {
            if((nums[j] & 1) == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j=i+1;
            }
            else {
                j++;
            }
        }
        return nums;
    }
}
