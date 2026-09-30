class Solution {
    public String restoreString(String s, int[] indices) {

        char [] ch = new char[s.length()];
        
        int i = 0;
        while(i < s.length()){

            ch[indices[i]] = s.charAt(i);
            i++;
        }

        return new String(ch);
        
    }
}