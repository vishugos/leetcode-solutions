class Solution {
    public int leastInterval(char[] tasks, int n) {

       
       int [] freq = new int[26];


       for(char  ch : tasks){
             
             freq[ch - 'A']++;

       } 

       int maxfreq = 0;
       
       int cntmax = 0;
       for(int i = 0; i < freq.length; i++){

        maxfreq = Math.max(maxfreq , freq[i]);

       }
            
        for(int f : freq){
            if( f == maxfreq){

                cntmax++;
            }
        }
       

       int partcount = maxfreq - 1;

       int emptyslots = partcount * (n - (cntmax - 1));

       int availabletasks = tasks.length - (maxfreq * cntmax);

       int idle = Math.max(0 , emptyslots - availabletasks);

        
        return tasks.length + idle ;

        
    }
}