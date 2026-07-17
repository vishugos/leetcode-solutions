class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {


         HashMap<Integer , Integer> map = new HashMap<>();

         int currIndex = 0;
         int previousIndex = 0;

         for(int i = 0 ; i < nums.length; i++){

            if(map.containsKey(nums[i])){

                int prevIndex = map.get(nums[i]);
                if( i - prevIndex <= k){
                return true;
                }
            }
        
            map.put(nums[i] , i);
         }

         return false;
    }
}