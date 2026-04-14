class Solution {
    public int characterReplacement(String s, int k) {
        
        HashMap<Character,Integer> resMap = new HashMap<>();
        int start = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for(int i=0; i<s.length(); i++)
        {
            resMap.put(s.charAt(i), resMap.getOrDefault(s.charAt(i),0)+1);
            maxFreq = Math.max(maxFreq, resMap.get(s.charAt(i)));
            
            if((i-start+1)-maxFreq > k)
            {
             char c =  s.charAt(start);
             resMap.put(s.charAt(start), resMap.getOrDefault(s.charAt(start),0)-1);
             start++;

            }
            maxLength = Math.max(maxLength, (i-start+1));

        }

        return maxLength;
    }
}
