class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        int slow = 0;

        for(int fast = 1 ; fast < n ; fast++){
           
         if(nums[slow] == nums[fast]){
            
         }else{

            slow++;
            nums[slow] = nums[fast];
         }
        }

        return slow + 1;
    }
}