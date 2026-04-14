class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int start = 0;
        
        HashMap<Character, Integer> resMap = new HashMap<>();
        HashMap<Character, Integer> resMap1 = new HashMap<>();

        for(int i=0; i<s1.length(); i++)
        {
            resMap.put(s1.charAt(i), resMap.getOrDefault(s1.charAt(i),0)+1);
        }

        for(int i=0; i<s2.length(); i++)
        {
            resMap1.put(s2.charAt(i), resMap1.getOrDefault(s2.charAt(i),0)+1);

            if((i-start+1) == s1.length())
            {
                if(resMap.equals(resMap1))
                {
                    return true;
                }
                resMap1.put(s2.charAt(start), resMap1.get(s2.charAt(start))-1);
                if(resMap1.get(s2.charAt(start))<=0)
                {
                    resMap1.remove(s2.charAt(start));
                }
                start++;
            }

        }

        return false;

    }
}
