class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int n1 = str1.length();

        int n2 = str2.length();

        int len = Math.min(n1 ,n2);

        while(len > 0){

            if(n1 % len == 0 && n2 % len == 0){

                String candidate = str1.substring(0 , len);

                if(canMake(str1 , candidate) && canMake(str2 , candidate)){

                return candidate;
                }
            }

                  len--;
        }
        return "";
        
    }

    public boolean canMake( String str ,  String candidate){

        int times = str.length() / candidate.length();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < times; i++){

            sb.append(candidate);
        }

        return sb.toString().equals(str);
    }
}