class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> resMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
        {
            if(resMap.containsKey(target - nums[i]))
            {
                int element1 = resMap.get(target-nums[i]);
                return new int[]{element1, i};
            }

            resMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
