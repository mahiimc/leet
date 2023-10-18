public class SortColors {

    public static void main(String[] args) {
        int[] nums = { 2,0,2,1,1,0 };
        // int[] nums = {2,0,1};
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


    public static void sortColors(int[] nums) {
        if(nums.length == 1) return ;
        int left = 0 ;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right) {
            if(nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                swap(nums, mid, right);
                right--;
            }
        }
    }

    public static void sortColorsNaive(int[] nums) {
        if(nums.length == 1) return ;
        int left = 0;
        int right = nums.length - 1;
    

        while (left < right) {
            if(nums[left] == 0 ) {
                left++;
            }
            else if (nums[left] == 1) {
               int tempLeft = left;
                while(tempLeft <= nums.length-1) {
                    if( nums[tempLeft] == 0) {
                        swap(nums, left, tempLeft);
                        break;
                    }
                    else {
                        tempLeft++;
                    }
                }
                left++;
            }
            else {
                swap(nums, right, left);
                right--;
            }
            
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
