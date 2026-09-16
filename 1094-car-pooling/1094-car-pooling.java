class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

    int [] passengerAt = new int[1001];

    for(int t = 0 ; t < trips.length; t++){

        int passenger = trips[t][0];

        int start = trips[t][1];

        int end = trips[t][2];

        for(int i = start; i < end ; i++){

            passengerAt[i] += passenger;

            if(passengerAt[i] > capacity ){
                return false;
            } 
        }
    }

    return true;
        
    }
}