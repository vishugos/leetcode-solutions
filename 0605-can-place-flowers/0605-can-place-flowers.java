class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
 
        int last = flowerbed.length - 1;
    
     for(int i = 0; i < flowerbed.length; i++){


        if(n == 0) return true;

        boolean leftEmpty = (i == 0) || (flowerbed[i-1] == 0);

       boolean rightEmpty = (i  == last) || (flowerbed[i+1] == 0);

       boolean currEmpty = (flowerbed[i]  == 0);

        if(leftEmpty && rightEmpty && currEmpty ){

            flowerbed[i] = 1 ;

            n--;

            if(n == 0){
                return true;
            }
        }

     }

     return false;
        
    }
}