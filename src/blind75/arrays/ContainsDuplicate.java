package blind75.arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> boolMap=new HashMap<>();
        int v=nums.length;
        for(int i=0;i<v;i++){
            int value=nums[i];
            if(boolMap.containsKey(value)){
                return true;
            }
            boolMap.put(nums[i],i);
        }
        return false;
    }
}