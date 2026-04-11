class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();
        int maxCount = 0;

        for(int i : nums)
        {
            numSet.add(i);
        }

        for(int i : nums)
        {
            if(!numSet.contains(i-1))
            {
                int count = 0;
                int number = i;

                while(numSet.contains(number))
                {
                    count++;
                    number++;
                    maxCount = Math.max(maxCount, count);
                }
            }
        }

        return maxCount;
    }
}
