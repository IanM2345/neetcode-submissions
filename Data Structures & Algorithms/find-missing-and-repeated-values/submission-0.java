class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map = new HashMap<>();
        int duplicate = 0;
        int dimensions = grid.length*grid[0].length;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0)+1);

                if(map.get(grid[i][j])==2){
                    duplicate = grid[i][j];
                }
            }
        }

        for(int i=dimensions; i>0; i--){
            if(!map.containsKey(i)){
                dimensions = i;
                break;
            }
        }

        return new int[]{duplicate,dimensions};
    }
}