class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int arr[] = new int[n-k+1];
        Deque<Integer> q = new LinkedList<>();

        for(int i=0; i<n; i++)
        {
            if(!q.isEmpty() && q.peekFirst()<=i-k)
            {
                q.pollFirst();
            }

            while(!q.isEmpty() && nums[q.peekLast()]<nums[i])
            {
                q.pollLast();
            }

            q.addLast(i);

            if(i >= k-1)
            {
                arr[i-k+1] = nums[q.peekFirst()];
            }


        }
                    return arr;




    }
}
