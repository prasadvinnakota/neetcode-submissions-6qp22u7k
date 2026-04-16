class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] result = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        Arrays.fill(result,0);

        for(int i=0; i<temperatures.length; i++)
        {
           
                while(!s.isEmpty() && (temperatures[i] > temperatures[s.peek()]))
                {
                    int j = s.pop();
                    result[j] = (i-j);
                }
                s.push(i);

        }

        return result;

    }
}
