class Solution {
    public boolean wordPattern(String pattern, String s) {
        
       
       String [] words = s.split(" ");

       // pattern and words should have same length

       if(pattern.length() != words.length ){

        return false;
       }

       //mapping 
       Map<Character , String > map = new HashMap<>();

       Map<String , Character> reverse = new HashMap<>();

       for(int i = 0; i < pattern.length() ; i++){

        char ch = pattern.charAt(i);

        String word = words[i];

        //if character pehle kisi word se map to nhi 

        if(map.containsKey(ch)){
            if(!map.get(ch).equals(word)){
                return false;
            }
        }

        // if word pehle kisi ch se mapped to nhi
        if(reverse.containsKey(word)){
         if(reverse.get(word) != ch){
                return false;
            }
        }

        map.put(ch, word);
        reverse.put(word , ch);
       }
      return true;
    }
}