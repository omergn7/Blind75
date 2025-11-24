package blind75.arrays;
import java.util.HashMap;

class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int n=nums.length;

        for (int i=0;i<n;i++){
            int complement=target-nums[i];
            if(hashMap.containsKey(complement)){
                return new int[]{hashMap.get(complement),i};
            }
            hashMap.put(nums[i],i);
        }

        return new int[]{};

    }
}