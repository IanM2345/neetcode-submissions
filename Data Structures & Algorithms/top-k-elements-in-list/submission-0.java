class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map < Integer, Integer> map = new LinkedHashMap();
 
        for(int num: nums){
           map.put(num, map.getOrDefault(num,0)+1);
        }

        int[] result = map.entrySet().stream()
                          .sorted((a, b) -> b.getValue() - a.getValue())
                          .limit(k)
                          .mapToInt(Map.Entry::getKey)
                          .toArray();

        return result;
        
    }
}
