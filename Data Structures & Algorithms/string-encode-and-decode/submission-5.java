class Solution {

    public String encode(List<String> strs) {
        StringBuilder builtString = new StringBuilder();
        for(String str : strs){
            builtString.append(str.length()).append("#").append(str);
        }
        return builtString.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> decodedStrings = new ArrayList();
        int i=0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            decodedStrings.add(str.substring(j+1,j+1+length));
            i=j +1+length;
        }

        return decodedStrings;
    }
}
