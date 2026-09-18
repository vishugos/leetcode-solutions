class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int base = 0;
        int extra = 0;
        int subExtra = 0;

        for(int i = 0; i < customers.length ; i++){
          
          if(grumpy[i] == 0){

            base += customers[i];
            
          }
        }   

        for(int i = 0 ; i < minutes; i++){

           if(grumpy[i] == 1 ){
            
            extra += customers[i];
            
           }

        }

        subExtra = extra;

        for(int i = minutes; i < customers.length; i++){

            if(grumpy[i - minutes] == 1){

                extra -= customers[i - minutes];

            }

            if( grumpy[i] == 1){

                extra += customers[i];
            }

            subExtra = Math.max(extra , subExtra);
        }

        return base + subExtra;

    }
}