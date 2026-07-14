class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


        int n = nums.length;

        int curr = 0;
        int max = 0;


        for(int i = 0; i <n ;i++){

            if(nums[i] == 1) {
                curr++;
                max = Math.max(max , curr);
            }else{

                curr = 0;
            }

        }
        return max;
    }
}