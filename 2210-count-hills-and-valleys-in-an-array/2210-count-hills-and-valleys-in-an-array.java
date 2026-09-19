class Solution {
    public int countHillValley(int[] nums) {

        int cnt = 0;

        int n = nums.length;

        for(int i = 1 ; i < nums.length - 1; i++){

            
        int left = i - 1;

        int right = i + 1;


        if(i > 0 && nums[i] == nums[i -1]){
            continue;
        }

             
             while(left >= 0 && nums[left] == nums[i]){
                left--;
             }

             while(right < n && nums[right] == nums[i]){
                right++;
             }
               
               // if this is valley
            if( left >= 0 && right < nums.length  &&  nums[left] > nums[i]
                  
                  && nums[i] < nums[right]){
                    cnt++;
                  }

              // if this is hill
            else if(left >= 0 && right < nums.length && nums[right] < nums[i] 
            
            
                 && nums[left] < nums[i]){
                    cnt++;
                 }
                  
        }

        return cnt;
        
    }
}