class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five = 0;
        int ten = 0;
        

        for(int i = 0 ; i < bills.length;i++){
          
          //edge case 
          if(bills[0] > 5) return false;

          if(bills[i] == 5){
            five++;

          }else if(bills[i] == 10 ){

            ten++;
            
            if(five == 0){
                return false;
            }else{
                five--;
            }
          }

          else if(bills[i] == 20){

            if( five >= 1 && ten >= 1){
            

                ten--;
                five--;

            }else if( five >= 3  ){
               
               

                five=five - 3;
            }else{
                return false;
            }
          }

        }
        return true;
    }
}