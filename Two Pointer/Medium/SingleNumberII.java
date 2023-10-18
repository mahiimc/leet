import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumberII {
    
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumberWithHashMap(nums));
    }

    public static int singleNumberWithHashMap(int nums[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        final AtomicInteger uniqe = new AtomicInteger(0);
        map.forEach((k,v) -> {
           if(v == 1) {
                uniqe.set(k);
           }
        });
        return uniqe.get();
    }

    public static int singleNumber(int[] nums) {
        int single = 0;
        for(int num : nums) {
            single = single ^ num;
        }
        return single;
    }



}
