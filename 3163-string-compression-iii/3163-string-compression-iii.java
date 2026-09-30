class Solution {
    public String compressedString(String word) {

        StringBuilder comp = new StringBuilder();

        int i = 0;
        while( i < word.length()){

            char ch =  word.charAt(i);
            int cnt = 0;

            while(i < word.length() && ch == word.charAt(i) && cnt < 9){
                cnt++;
                i++;
            }
            comp.append(cnt);
            comp.append(ch);

        }
        return comp.toString();
        
    }
}