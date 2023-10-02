
public class TrappingRainWater {
    public static void main(String[] args) {
       int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
       int result = twoPointer(heights);
       System.out.println("Total :" + result);

    }


    public static int twoPointer(int[] heights) {
        int sum = 0;

        int left = 0;
        int right = heights.length - 1;
        
        int leftMax = heights[left];
        int rightMax = heights[right];


        while( left < right ) {

            if(heights[left] <= heights[right]) {
                 if(leftMax < heights[left]) {
                    leftMax = heights[left];
                 }
                 else {
                    sum += leftMax - heights[left];
                 }
                 left++;
            }
            else {
                 if(rightMax < heights[right]) {
                    rightMax = heights[right];
                 }
                 else {
                    sum+=rightMax - heights[right];
                 }
                 right--;

            }
        }
        return sum;
    }

    public static int dynamic(int[] heights) {
        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];
        for(int i=0;i<heights.length;i++) {
            leftMax[i] = findLeftMax(i, heights);
            rightMax[i] = findRightMax(i, heights);
        }
        int sum = 0;
        for(int i=0;i<heights.length;i++) {
            int lm = leftMax[i];
            int rm = rightMax[i];
            sum+= lm < rm ? lm-heights[i] : rm-heights[i];
        }
        return sum;
    }



    public static int bruteForce(int[] heights) {
        int sum = 0;
        for(int i=0;i<heights.length;i++) {
            int leftMax = findLeftMax(i,heights);
            int rightMax = findRightMax(i,heights);
            sum+= (leftMax < rightMax) ? leftMax - heights[i] : rightMax - heights[i];
        }
        return sum;
    } 

    public static int findLeftMax(int index,int[] heights) {
        int max = Integer.MIN_VALUE;
        while(index >= 0) {
            if(heights[index] > max) {
                max = heights[index];
            }
            index--;
        }
        return max;
    }

    public static int findRightMax(int index,int[] heights) {
        int max = Integer.MIN_VALUE;
        while(index < heights.length) {
            if(heights[index] > max ) {
                max = heights[index];
            }
            index++;
        }
        return max;
    }
}
