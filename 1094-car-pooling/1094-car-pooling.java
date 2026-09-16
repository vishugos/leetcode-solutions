class Solution {
    public boolean carPooling(int[][] trips, int capacity) {

    int [] passengerAt = new int[1001];

    int [] diff = new int[1001];

    for(int t = 0 ; t < trips.length; t++){

        int passenger = trips[t][0];

        int start = trips[t][1];

        int end = trips[t][2];

        diff[start] += passenger;

        diff[end] -= passenger;

       
    }
     int currentpassenger = 0;

        for(int i = 0; i <= 1000; i++){

            currentpassenger += diff[i];

            if(currentpassenger > capacity){
                return false;
            }
        }

    return true;
        
    }
}