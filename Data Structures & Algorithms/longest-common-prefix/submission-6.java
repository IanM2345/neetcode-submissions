class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);

        int n = Math.min(strs[0].length(), strs[strs.length - 1].length());

        for (int i = 0; i < n; i++) {
            for (String s : strs) {
                if (s.length() == i || s.charAt(i) != strs[0].charAt(i)) {
                    return s.substring(0, i);
                }
            }
        }

        return strs[0];
    }
}