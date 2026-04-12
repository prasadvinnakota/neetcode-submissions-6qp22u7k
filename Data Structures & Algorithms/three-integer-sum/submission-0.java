class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int totalSumValue = 0;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++)
        {
            int target = totalSumValue - nums[i];
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int start = i+1;
            int end = nums.length-1;
            while(start < end)
            {
                if(nums[start]+nums[end]==target)
                {
                    List<Integer> list1 = new ArrayList();
                    list1.add(nums[i]);
                    list1.add(nums[start]);
                    list1.add(nums[end]);
                    res.add(list1);
                    while(start < end  && nums[start]==nums[start+1])
                    {
                        start++;
                    }
                    while(start < end && nums[end]==nums[end-1])
                    {
                        end--;
                    }
                    start++;
                    end--;
                }
                else if(nums[start]+nums[end] > target)
                {
                    end--;
                }
                else
                {
                    start++;
                }
            }
        }

        return res;
    }
}
