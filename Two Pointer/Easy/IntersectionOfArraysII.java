import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfArraysII {

    public static void main(String[] args) {
        int[] arr1 = {3,1,2};
        int[] arr2 = {1,1};
        int[] res = intersection(arr1, arr2);
        for(int num : res) {
            System.out.println(num);
        }
    }

    public static int[] helper(int[] small , int[] large) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : large) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int[] result = new int[small.length];
        int index = 0;
        for(int num : small) {
            if(map.containsKey(num) && map.get(num) >= 1) {
                result[index++] = num;
                map.put(num, map.get(num)-1);
            }
        }
        return Arrays.copyOf(result, index);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        return nums1.length > nums2.length ? helper(nums2, nums1) : 
        helper(nums1, nums2);
    }
    
}
