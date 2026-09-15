class Solution {
    public List<Integer> getRow(int rowIndex) {


        List<Integer> row = new ArrayList<>();

        long value = 1;

      for(int j = 0 ; j <= rowIndex; j++){

        row.add((int)value);
        
        value = value * (rowIndex - j) / (j+1);


      }

      return row;
    }
}