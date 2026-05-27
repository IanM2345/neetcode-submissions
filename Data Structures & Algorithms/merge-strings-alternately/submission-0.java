class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder string = new StringBuilder();

        int min = Math.min(word1.length(),word2.length());
        int i=0;  
        for ( i=0; i<min;i++){
            string.append(word1.charAt(i));
            string.append(word2.charAt(i));
        }

        string.append(word1.substring(i));
        string.append(word2.substring(i));

        return string.toString();
        
    }
}