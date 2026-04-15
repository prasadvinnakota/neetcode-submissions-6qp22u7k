class Solution {
    public String minWindow(String s, String t) {
        
        int start  = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        String p = "";

        HashMap<Character, Integer> resMap = new HashMap<>();
        HashMap<Character, Integer> resMap1 = new HashMap<>();

        for(int i=0; i<t.length(); i++)
        {
            resMap.put(t.charAt(i), resMap.getOrDefault(t.charAt(i),0)+1);
        }

        for(int j=0; j<s.length(); j++)
        {
            resMap1.put(s.charAt(j), resMap1.getOrDefault(s.charAt(j),0)+1);

            if(resMap.containsKey(s.charAt(j)) && (resMap1.get(s.charAt(j)) <= resMap.get(s.charAt(j))))
            {
                count++;
            }

            while(count == t.length())
            {
               if((j-start+1) < minLength)
               {
                minLength = (j-start+1);
                p = s.substring(start, j+1);
               }

               if((resMap.get(s.charAt(start))==null) || resMap1.get(s.charAt(start)) > resMap.get(s.charAt(start)))
               {
                resMap1.put(s.charAt(start),resMap1.get(s.charAt(start))-1);
                start++;
               }
               else
               {
                resMap1.put(s.charAt(start),resMap1.get(s.charAt(start))-1);
                start++;
                count--;
               }
            }
        }

        return p;
    }
}
