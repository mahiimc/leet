import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] res = intersection(arr1, arr2);
        for(int num : res) {
            System.out.println(num);
        }
    }

    public static int[] intersection(Set<Integer> set1 , Set<Integer> set2) {
        int[] res = new int[set1.size()];
        int index = 0;
        for(int num : set1) {
            if(set2.contains(num)) {
                res[index++] = num;
            }
        }
        return res;
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }
        for(int num: nums2) {
            set2.add(num);
        }
        return set1.size() > set2.size() ? intersection(set2,set1) : intersection(set1, set2);
    }
    
}
