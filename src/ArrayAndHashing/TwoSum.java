package ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int e: nums){
            if (list.contains(target-e)){
                return new int[]{list.indexOf(target-e),list.size()};
            }
            list.add(e);
        }
        return new int[]{-1,-1};
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new java.util.HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
