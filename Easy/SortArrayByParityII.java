public class SortArrayByParityII {

    public static void main(String[] args) {
        int[] nums = {2,3};
        int[] res = sortArrayByParityII(nums);
        for(int num : res) {
            System.out.print(num+" ");
        }
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int[] even = new int[nums.length/2];
        int[] odd = new int[nums.length/2];
        for(int i=0,j=0,k=0;i<nums.length;){
            if((nums[i] & 1) == 0) {
                even[j++] = nums[i++];
            }
            else {
                odd[k++] = nums[i++];
            }
        }

        for(int i=0,j=0;j<even.length;i=i+2) {
            nums[i] = even[j++];
        }

        for(int i=1,j=0;j<even.length;i=i+2) {
            nums[i] = odd[j++];
        }

               
        return nums;
    }
}
