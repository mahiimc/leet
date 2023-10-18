import java.util.Arrays;

public class FlipImage {

    public static void main(String[] args) {
        //[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]
        int[][] image = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {1,0,1,0}
        };
        image = flipAndInvertImage(image);
        for(int[] arr : image) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int index = 0; index < image.length;index++) {
            image[index] = op(image[index]);
        }
        return image;
    }

    public static int[] op(int[] arr) {
        arr = rev(arr);
        arr = inverse(arr);
        return arr;
    }

    public static int[] rev(int[] subArray) {
        int j=subArray.length-1;
        for(int i=0;i<subArray.length/2;i++) {
            int temp = subArray[i];
            subArray[i] = subArray[j];
            subArray[j--] = temp;
        }
        return subArray;
    }

    public static int[] inverse(int[] subArray) {
        for(int i=0;i<subArray.length;i++) {
            if(subArray[i] == 0) {
                subArray[i] =1;
            }
            else {
                subArray[i] = 0;
            }
        }
        return subArray;
    } 

    
}
