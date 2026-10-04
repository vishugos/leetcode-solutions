class Solution {
    public int maximumValue(String[] strs) {

        int max = 0;
        for(int i = 0; i < strs.length; i++){

            String s = strs[i];

            boolean digit = true;

            for(int j = 0; j < s.length(); j++){

                char  ch =  s.charAt(j);

                if(!Character.isDigit(ch)){

                    digit = false;
                    break;
                }
            }

            int value;

            if(digit){
                value = Integer.parseInt(s);
            }else{

                value = s.length();
            }

            max  = Math.max(max , value);
        }
        return max;
    }
}