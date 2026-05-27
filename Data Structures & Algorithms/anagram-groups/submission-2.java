class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map <String, List<String>> map = new LinkedHashMap<>();

        for( String word: strs){
            int sum=0;
            char [] letter = word.toLowerCase().toCharArray();
            Arrays.sort(letter);
            String sorted = new String(letter);
            map.computeIfAbsent(sorted, k -> new ArrayList()).add(word);
        }
        
        return new ArrayList(map.values());
    }
}
