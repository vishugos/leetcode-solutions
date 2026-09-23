class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String , List<String>> map = new HashMap<>();

        for(String word : strs){
            
            //word ko char m sort karenge 
            char [] ch = word.toCharArray();

            Arrays.sort(ch);

            //sort ke baad issme hum string m store kr lenge 

            String key = new String (ch);
               
               // check karenge ki map m key hai ya nhi
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }
            
            // agr map m key already hai to hum new List nhi banaige existing m add karenge 
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}