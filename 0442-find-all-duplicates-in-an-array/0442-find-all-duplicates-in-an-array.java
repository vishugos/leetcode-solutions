class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        int [] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++){

            freq[nums[i]]++;
        }

        List<Integer> li = new ArrayList<>();

        for(int i = 1 ; i <= nums.length; i++){
         
             if(freq[i] == 2){

                li.add(i);
             }

        }

        return li;
        
    }
}