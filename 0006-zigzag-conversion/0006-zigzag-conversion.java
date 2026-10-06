class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || s.length() <= numRows){
            return s;
        }

        String [] rows = new String[numRows];
        
        for(int i = 0; i < numRows; i++){

            rows[i] = "";
        }
        int row = 0;
        boolean goingDown = true;
        for(int i = 0; i < s.length(); i++){
      
            rows[row] += s.charAt(i);
            
            if(row == numRows - 1){
                goingDown = false;
            }
            
            else if(row == 0){
                goingDown = true;
            }
           
           if(goingDown){
            row++;
           }else{
            row--;
           }
        }

        String ans = "";
        for(int i = 0; i < numRows; i++){

            ans += rows[i];
        }

        return ans;
    }
}