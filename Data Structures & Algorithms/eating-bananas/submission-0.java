class Solution {

    public boolean helper(int[] piles, int minValue, int h)
    {
      int hours = 0;
      for(int i=0; i<piles.length; i++)
      {
        int n = piles[i];

        hours = hours + (n+minValue-1)/minValue;
        if(hours>h)
        {
            return false;
        }
        
      } 

        return true;
    
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE; 
        int minValue = Integer.MAX_VALUE;
        for(int i : piles)
        {
            if(i > high)
            {
                high = i;
            }
        }

        while(low <= high)
        {
            int mid = (low+high)/2;

            if(helper(piles, mid, h))
            {
                minValue = Math.min(minValue, mid);
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }

        return minValue;

    }
}
