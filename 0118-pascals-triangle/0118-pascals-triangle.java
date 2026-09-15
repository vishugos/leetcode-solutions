class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

    
        for(int row = 0; row < numRows; row++){


            List<Integer> currRow = new ArrayList<>();


            //first element is 1 

            currRow.add(1);

            //middle elements
            for(int i = 1 ; i < row ; i++){

                int value = ans.get(row - 1).get(i -1) + ans.get(row - 1).get(i);

                currRow.add(value);
                            
            }

            if(row > 0 ){

                currRow.add(1);
            }

            ans.add(currRow);


        }

        return ans;
        
    }
}