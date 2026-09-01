class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // first we have to traverse the array from the end
        for(int i = n-1 ; i >= 0; i--){
       
          if(digits[i] < 9){
            digits[i]++;
            return digits;
          }
          // if not less than 9 make it zero
            digits[i] = 0;
          
        }
         int [] newNum = new int [n + 1];

            newNum[0] = 1;
             
            return newNum;
        
    }
}