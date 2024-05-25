package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int e: nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for (int key : map.keySet()){
            int freq = map.get(key);
            if (bucket[freq]==null){
                bucket[freq] = new java.util.ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = bucket.length-1; i>=0 && index<k; i--){
            if (bucket[i]!=null){
                for (int e : bucket[i]){
                    res[index++] = e;
                }
            }
        }
        return res;
    }
}
