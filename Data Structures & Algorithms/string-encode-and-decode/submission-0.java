class Solution {

    public String encode(List<String> strs) {
        StringBuilder secret = new StringBuilder();

        for (String word: strs){
            secret.append(word.length()).append('#').append(word);
        }

        return secret.toString();
    }

    public List<String> decode(String str) {
        List<String> readable = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt((j)) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j= i + length;
            readable.add(str.substring(i,j));
            i=j;
        }
        return readable;
    }
}
