class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Set<String > seen = new HashSet<>();

        Set<String > result = new HashSet<>();

        int n =  s.length();

        for(int i = 0; i <= n - 10; i++){

            String sequence  = s.substring(i , i + 10); 

            if(seen.contains(sequence)){
                result.add(sequence);
            }else{

                seen.add(sequence);
            }

        }

        return new ArrayList<>(result);

    }
}