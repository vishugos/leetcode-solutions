class Solution {
    public int myAtoi(String s) {

     // pehle hum leading spaces skip karenge

     int i = 0;
     int sign = 1;
     int n = s.length();

     while(i < n && s.charAt(i) == ' '){

        i++;
     }
     if(i < n && s.charAt(i) == '-'){
        
        sign = -1;
        i++;
     }

     else if(i < n && s.charAt(i) == '+'){

        sign = +1;
        i++;
     }

     //ab number build karna hai
      int digit = 0;
      int num = 0;
     while(i < n && Character.isDigit(s.charAt(i))){
     
     digit = s.charAt(i) - '0';
      
      // ab overflow check
     if(num > (Integer.MAX_VALUE - digit)/10){

        if(sign == 1){
            return Integer.MAX_VALUE;
        }
        else{
            return Integer.MIN_VALUE;
        }

     }
     num = num * 10 + digit;
     i++;
     }
       return sign * num; 
    }
}