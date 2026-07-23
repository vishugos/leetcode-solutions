class Solution {
    public int candy(int[] ratings) {


        int [] candies = new int [ratings.length];

        Arrays.fill(candies , 1);


        for(int i = 1 ; i < ratings.length ; i++){

            // traverse left to right 

            if(ratings[i] > ratings[i - 1]){

                candies[i] = candies[i - 1] + 1;
            }
        }

         for(int i = ratings.length - 2 ; i >= 0 ; i--){

            // traverse from right to left
           if(ratings[i] > ratings[ i + 1]){

               candies[i] = Math.max(candies[i] , candies[i + 1] + 1);
           }
         }

         int total = 0;
         
         for(int can: candies){

            total += can;
         }

         return total;
        
    }
}