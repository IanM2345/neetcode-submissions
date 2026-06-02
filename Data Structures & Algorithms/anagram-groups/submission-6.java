class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] letter = s.toCharArray();
            Arrays.sort(letter);
            String sorted = new String(letter);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
