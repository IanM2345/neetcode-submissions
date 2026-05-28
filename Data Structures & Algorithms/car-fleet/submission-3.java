class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double [][] meh = new double[position.length][2];

        for(int i=0; i<speed.length; i++){
            meh[i][0]= position[i];
            meh[i][1] = (double)(target-position[i])/speed[i];
        }

        Arrays.sort(meh,(a,b) -> Double.compare(b[0],a[0]));

        int fleet = 0;
        double maxTime = 0;

        for(int i=0; i<position.length; i++){
            double time = meh[i][1];

            if(time>maxTime){
                fleet++;
                maxTime = time;
            }
        }
        return fleet;
    }
}
