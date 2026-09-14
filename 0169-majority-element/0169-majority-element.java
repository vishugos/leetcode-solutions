class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++){

            if(cnt == 0){
                candidate = nums[i];
                cnt++;
            }

            else if(candidate == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }

         return candidate;
        
    }
}