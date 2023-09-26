public class RemoveDuplicates {
    public static void main(String[] args) {
    //    int[] arr = {0,0,1,1,1,2,2,3,3,4}; 
       int[] arr = {1};
       int len = removeDupllicates(arr); 
       for(int index = 0; index < len; index++) {
            System.out.print(arr[index]+" ");
       }
    }

    public static  int removeDupllicates(int[] nums) {
        
        if( nums.length == 1 ) { 
            return 1;
        }
        
        int i=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
               i++;
               nums[i] = nums[j]; 
            }
        }
        return i+1;
    }
}