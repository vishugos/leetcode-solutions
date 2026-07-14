class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;


          int fast = 0;
          int slow = 0;

          for( fast = 0; fast < n; fast++){

            if(nums[fast] !=  0){

                int temp = nums[fast];

                nums[fast] = nums[slow];

                nums[slow] = temp;

                slow++;
            }

          }

    }
}