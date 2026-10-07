class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        
        List<String> result = new ArrayList<>();

        int i = 0;

        // pure words pe traverse karna 
        while( i < words.length){
            
            int j = i;
            int totalLength = 0;

            // current line m max word find 
            while(j < words.length){
               
             int wordLength = words[j].length();
             
             // words ke beech m minium space 
             int spaces = j - i;

             // check kro word fit ho rha hai ya nhi

             if(wordLength + spaces + totalLength > maxWidth){

                break;
             }

             totalLength += wordLength;
             j++;

            }

            // jab uper wala loop break ho gya check curr line m kitne words hai

            int numberOfWords = j - i;

            // words ke beech m gaps kitne hai

            int gaps = numberOfWords - 1;

            StringBuilder line = new StringBuilder();

           // ab m ye check karunga ki ye last line ya single word to nhi

           if(j == words.length || gaps == 0){

            for(int k = i ; k < j ; k++){

                line.append(words[k]);

                // words ke beech normal one word space 
                if(k < j - 1){
                    line.append(" ");
                }
            }
             
             // baaki spaces ko right side append krna 
            while(line.length() < maxWidth){
                line.append(" ");
            }
           } // agar ye last word ya sirf ek word nhi hai to
           else{
            //normal justified line

             int totalSpaces = maxWidth - totalLength;

             // har gap ko minium kitne spaces milne chaiye

             int baseSpaces = totalSpaces / gaps;

             // kitne extra spaces bach gye 

             int extraSpaces = totalSpaces % gaps;

             for(int k = i ; k < j; k++){
                line.append(words[k]);

                // last word ke baad space nhi 

                if(k < j - 1){

                    int spaces = baseSpaces;

                    // extra space left se distribute karenge 

                    if(k - i < extraSpaces){
                        spaces++;
                    }

                    //spaces add kro

                    for(int x = 0; x < spaces; x++){
                        line.append(" ");
                    }
                }
                

             }

           }

           //complete line result m add
           result.add(line.toString());

           // next line ke starting word pe jao

           i = j;



        }
       return result;

    }
}