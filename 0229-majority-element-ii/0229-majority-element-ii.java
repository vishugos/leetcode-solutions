class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> li = new ArrayList<>();
        
        int c1 = 0 , c2 = 0;

        int e1 = Integer.MIN_VALUE , e2 = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++ ){

            if(c1 == 0 &&  e2 != nums[i]){
                c1++;
                e1 = nums[i];
            }
            else if(c2 == 0 && e1 != nums[i]){
                c2++;
                e2 = nums[i];
            }

            else if(e1 == nums[i] ) c1++;
            else if(e2 == nums[i]) c2++;

            else{
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;

        for(int el :  nums){

            if(el == e1 )c1++;
            if(el == e2 )c2++;

        }

        if(c1 > nums.length / 3){
            li.add(e1);
        }

        if(c2 > nums.length/ 3){
            li.add(e2);
        }


        return li;
        
    }
}