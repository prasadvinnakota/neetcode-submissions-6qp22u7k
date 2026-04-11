class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre  = 1;
        int result[] = new int[nums.length];

        result[0] = pre;
        pre = pre * nums[0];

        for(int i=1; i<nums.length; i++)
        {
            result[i] = pre;
            pre = nums[i] * pre;
        }


        pre = 1;
        result[nums.length-1] = pre * result[nums.length-1];
        pre = nums[nums.length-1] * pre;

        for(int i=nums.length-2; i>0; i--)
        {
            result[i] = result[i] * pre;
            pre = nums[i] * pre;

        }

        result[0] = result[0] * pre;

        return result;





    }
}  
