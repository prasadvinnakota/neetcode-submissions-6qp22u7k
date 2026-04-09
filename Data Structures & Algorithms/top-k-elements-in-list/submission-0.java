class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer, Integer> resMap = new HashMap<>();
        
        for(int p : nums)
        {
            resMap.put(p, resMap.getOrDefault(p,0)+1);
        }

        List<Integer>[] arr = new ArrayList[n+1];
        for(int i=0; i<=n; i++)
        {
            arr[i] = new ArrayList<>();
        }

        for(Map.Entry<Integer, Integer> map : resMap.entrySet())
        {
            List<Integer> list1 = arr[map.getValue()];
            list1.add(map.getKey());
            arr[map.getValue()] =  list1;
        }

        int result[] = new int[k];
        int idx = 0;

        for(int i=n; i>=0 && idx <k; i--)
        {
            for(Integer p: arr[i])
            {
                result[idx++] = p;
                if(k==idx) break;
            }
        }

        return result;



    }
}
