class TimeMap {

    class KayValuePair<K,V>
    {
        private final K key;
        private final V value;

        public KayValuePair(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public K getKey()
        {
            return key;
        }

        public V getValue()
        {
            return value;
        }
    }

    HashMap<String, List<KayValuePair<Integer, String>>> resultMap;

    public TimeMap() {
        resultMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        resultMap.computeIfAbsent(key, k->new ArrayList<>()).add(new KayValuePair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<KayValuePair<Integer, String>> values = resultMap.getOrDefault(key, new ArrayList<>());
        int left = 0;
        int right = values.size()-1;

        String result = "";

        while(left<=right)
        {
            int mid = (left+right)/2;

            if(values.get(mid).getKey() <= timestamp)
            {
                result = values.get(mid).getValue();
                left = mid + 1;
            }else
            {
                right = mid-1;
            }
        }
    return result;
    }


}
