class Solution {
    public int findDuplicate(int[] nums) {

        int slow = nums[0];

        int fast = nums[0];

        do{
            slow = nums[slow];

            fast = nums[nums[fast]];
        }while(fast !=  slow);


        // phase 2 when slow and fast pointer meet
        slow = nums[0];

        while(slow != fast){
        
          slow = nums[slow];
          fast = nums[fast];

        }
        return slow;
        
    }
}