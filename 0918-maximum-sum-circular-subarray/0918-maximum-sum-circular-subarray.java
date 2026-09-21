class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int  maxsum = nums[0];

        int curr  = nums[0];

        int total = nums[0];


        int currmin = nums[0];

        int minsum = nums[0];

        for(int i = 1 ; i < nums.length; i++){


              total  += nums[i];

            if(i > 0){

                // find max sum

           curr = Math.max(nums[i] , curr + nums[i]);

            maxsum = Math.max(curr , maxsum);


            // find min sum

            currmin = Math.min(nums[i] , nums[i] + currmin);

            minsum = Math.min(minsum , currmin);

            }
        }

        if(maxsum < 0){
            return maxsum;
        }

        int circularsum = total - minsum;

        return Math.max(circularsum , maxsum);

    }
}