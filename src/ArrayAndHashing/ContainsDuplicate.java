package ArrayAndHashing;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        for(int i=1 ; i<nums.length; i++){
            if(nums[i-1]==nums[i]) return true;
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int e : nums){
            if (map.containsKey(e)) return true;
            map.put(e,1);
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int e : nums){
            if (set.contains(e)) return true;
            set.add(e);
        }
        return false;
    }
}
