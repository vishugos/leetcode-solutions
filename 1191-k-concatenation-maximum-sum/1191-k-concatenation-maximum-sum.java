class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
         long MOD = 1000000007L;

        long curr = 0;
        long maxsum = 0;

        long total = 0;

        long prefix = 0;
        long maxprefix = 0;

        long suffix = 0;
        long maxsuffix = 0;

        for(int i = 0 ; i< arr.length; i++){

            total += arr[i];

            //first we have to find the maxsubarray

            curr = Math.max(0 , arr[i] + curr);

            maxsum = Math.max(curr , maxsum);


            
            // now we have to find the prefix

            prefix += arr[i];
            maxprefix = Math.max(prefix , maxprefix);

        }

        for(int i = arr.length -1 ; i >= 0 ; i--){

               // now we have to find out the suffix

            suffix += arr[i];
            maxsuffix = Math.max(suffix , maxsuffix);
        }

        long ans;

        if(k == 1){

            ans = maxsum;
        }else{
              
              // for 2 boundries
            long cross = maxsuffix + maxprefix;

            if( total > 0){

                cross += (long) (k - 2) * total ;


            }

            ans = Math.max(cross , maxsum);
        }

        return (int) (ans % MOD);
        
    }
}