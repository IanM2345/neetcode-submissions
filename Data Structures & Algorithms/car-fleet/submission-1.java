class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] car = new double[position.length][2];
        for (int i = 0; i < position.length; i++) {
            car[i][0] = position[i];
            car[i][1] = (double)(target - position[i])/speed[i];
        }
        Arrays.sort(car, (a, b) -> Double.compare(b[0], a[0]));

        int fleets = 0;
        double slowestTime = 0;

        for (int i = 0; i < position.length; i++) {
            double time = car[i][1];
            if (time > slowestTime) {
                fleets++;
                slowestTime = time;
            }
        }

        return fleets;
    }
}
