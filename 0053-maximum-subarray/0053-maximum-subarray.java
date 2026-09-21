class Solution {
    public int maxSubArray(int[] nums) {

        int maxsum = nums[0];

        int curr = nums[0];


        for(int i = 1; i < nums.length; i++){ 

            curr = Math.max(nums[i] , nums[i] + curr);

            maxsum = Math.max(maxsum , curr);
        }

        return maxsum;
        
    }
}