class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> result = new HashMap();
        for( String str : strs){
            int[] frequencyArray = new int[26];
            for( Character s : str.toCharArray()){
                frequencyArray[s -'a']++;
            }
            // List<Integer> frequencyList = Arrays.asList(frequencyArray);
            // rather than converting from primitvie array to list, convert frequency array to a string 
            String frequencyKey = Arrays.toString(frequencyArray);
            result.putIfAbsent(frequencyKey,new ArrayList());
            result.get(frequencyKey).add(str);
        }

        return new ArrayList(result.values());

    }
}
