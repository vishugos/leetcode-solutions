class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {

       int [] diff = new int[n+2] ;

       int [] ans = new int[n];

       for(int i = 0 ; i < bookings.length; i++){

          int start = bookings[i][0];

          int end = bookings[i][1];

          int seats = bookings[i][2];

          diff[start] += seats;

          diff[end + 1]  -= seats;
          

       }

       int curr = 0;

       for(int j = 1 ; j<= n; j++){

        curr += diff[j];

        ans[j - 1] = curr;

          
       }

    
      return ans;
        
    }
}