class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        int start = 0;
        HashMap<Character,Integer> mapStore = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            if(mapStore.containsKey(s.charAt(i)))
            {
                start = Math.max(start, mapStore.get(s.charAt(i))+1);
            }
            mapStore.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i-start+1);
        }

        return maxLength;
    }

}
