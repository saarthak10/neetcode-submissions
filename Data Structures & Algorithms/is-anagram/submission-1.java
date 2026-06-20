class Solution {
    HashMap<Character , Integer> firstStringMap = new HashMap();
    boolean result = true;
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i< s.length();i++){
            if(firstStringMap.containsKey(s.charAt(i))){
                firstStringMap.put(s.charAt(i),firstStringMap.get(s.charAt(i)) + 1);
            }else{
                firstStringMap.put(s.charAt(i),1);
            }
        }
        for(int j=0;j< t.length();j++){
            if(firstStringMap.containsKey(t.charAt(j))){
                firstStringMap.put(t.charAt(j),firstStringMap.get(t.charAt(j)) - 1);
            }
        }

        for( char ch : firstStringMap.keySet() ){
            if(firstStringMap.get(ch) != 0){
                return false;
            }
        }
        
        return result;

    }
}
