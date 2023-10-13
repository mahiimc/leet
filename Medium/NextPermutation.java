public class NextPermutation {

    public static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        for(int num : nums ) {
            System.out.print(num+" ");
        }

    }
    public static void nextPermutation( int[] nums ) {
        int j = nums.length-2;
        
        while( j >= 0 ) {
            if(nums[j+1] > nums[j]) {
                break;
            }
            j--;
        }

        if ( j == -1 ) {
             rev(nums, 0, nums.length-1);
             return ;
        }
        
        int max = j;
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[i] > nums[j]) {
                max = i;
                break;
            } 
        }
        swap(nums, j, max);
        rev(nums, j+1, nums.length-1);
    }

    public static void rev(int[] nums , int start, int end ) {
        while( start < end ) {
            swap(nums, start, end);
            start++;
            end--;
        }
    } 


    public static void swap(int[] nums , int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
