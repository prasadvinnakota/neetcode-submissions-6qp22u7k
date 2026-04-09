class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> res = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(String s : strs)
        {
            int arr[] = new int[26];
            Arrays.fill(arr, 0);
            for(int i=0; i<s.length(); i++)
            {
                arr[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++)
            {
                sb.append(String.valueOf(arr[i])).append("#");
            }
            List<String> s1 = res.getOrDefault(sb.toString(), new ArrayList());
            s1.add(s);
            res.put(sb.toString(), s1);

        }

        for(Map.Entry<String, List<String>> resp : res.entrySet())
        {
            result.add(resp.getValue());
        }

        return result;
    }
}
