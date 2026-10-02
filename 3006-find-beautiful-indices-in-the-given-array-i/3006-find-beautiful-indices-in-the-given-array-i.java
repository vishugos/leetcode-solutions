class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {

        List<Integer> posA = new ArrayList<>();
        List<Integer> posB = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        //pehle a ki index nikalenge 
        for(int i = 0; i <= s.length() - a.length(); i++){
            if(s.substring(i , i + a.length()).equals(a)){
               
               posA.add(i);
            }
        }
      
         // phir b ka index nikalenge
        for(int i = 0; i <= s.length() - b.length(); i++){
            if(s.substring(i , i + b.length()).equals(b)){

                posB.add(i);
            }
        }

        for(int i : posA){

            for(int j : posB){

                if(Math.abs(j - i) <= k){

                    ans.add(i);

                    break; // qki mujhe ek i ka index mil gya beauty ka 
                }
            }
        }
        return ans;
        
    }
}