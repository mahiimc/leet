import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.print(find132pattern(nums));
    }

    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] < third) return true;
            while(!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
