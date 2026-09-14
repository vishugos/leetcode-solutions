class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int total = 0 ;
        int ans = 0 ;
        int n = arr.length;

        for(int i = 0 ; i < n; i++){

            //first we have to find out the left and the right conrtibution

            // starting contribution
            int left =  i + 1 ;
            
          //  ending contribution
            int right  = n - i;
              
              // total contribution
            total = left * right;


          // find the odd contribuution
            int odd = (total + 1 ) / 2;
   
               
            // adding total contribution in ans 
            ans += arr[i] * odd;

        }

        return ans;
        
    }
}