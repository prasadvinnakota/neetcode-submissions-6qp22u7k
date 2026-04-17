class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Stack<Double> s = new Stack<>();
        int[][] pair = new int[position.length][2];
        int count = 0;

        for(int i=0; i<position.length; i++)
        {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b)->b[0] - a[0]);


        for(int[] p : pair)
        {
        Double d = (double)(target - p[0])/p[1];

            if(s.isEmpty() || s.peek() < d)
            {
                s.push(d);
                count++;
            }
        }

        return count;

    }
}
