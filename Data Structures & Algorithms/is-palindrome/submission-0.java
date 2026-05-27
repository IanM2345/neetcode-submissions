class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sent = new StringBuilder();

        for(char letter: s.toCharArray()){
            if(Character.isLetterOrDigit(letter)){
                sent.append(Character.toLowerCase(letter));
            }
        }

        return sent.toString().equals(sent.reverse().toString());
    }
}
