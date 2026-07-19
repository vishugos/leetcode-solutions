class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
       
       int cnt = 0;
       int i = 0 ;// child
       int j = 0 ;// cookie
           
          
       
       while(i < g.length && j < s.length ){

        // case 1 if the cookie is bigger than the child

        if(g[i] <= s[j] ){
         
         i++;
         j++;

         cnt++;

        

        }else{

            j++;
        }

       
       }
     
     return cnt;

    }
}
