class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> diction = new HashMap();
        for(String str : strs){

            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            diction.putIfAbsent(sortedString,new ArrayList<>());

            diction.get(sortedString).add(str);
        }
        return new ArrayList<>(diction.values());

    }
}
