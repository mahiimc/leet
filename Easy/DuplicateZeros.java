public class DuplicateZeros {
    public static void main(String[] args) {
        int arr[] = {0,4,1,0,0,8,0,0,3};
        duplicateZeros(arr);
        for(int num : arr) {
            System.out.print(num+" ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;) {
            if(arr[i] == 0) {
                int j = arr.length-1;
                while( j >= i + 1 ) {
                    arr[j] = arr[j-1];
                    j--;
                }
                i=i+2;
            }
            else {
                i++;
            }
        }
    }
}
