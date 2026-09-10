class Solution {

    public String encode(List<String> strs) {
        ArrayList<Integer> sizesList = new ArrayList<>();
        if(strs.size()==0){
            return "";
        }
        String finalString = "";
        String wordString = "";
        for(int i=0;i<strs.size();i++){
         sizesList.add(strs.get(i).length());   
          wordString = wordString + strs.get(i);    
        }

        for(int j=0;j< sizesList.size();j++){
            finalString = finalString + sizesList.get(j);
            if(j != sizesList.size() -1){
               finalString =  finalString + ",";
            }
        }
        finalString = finalString + "#";

        finalString = finalString +wordString;
        System.out.println(finalString);
        return finalString;
    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return Collections.emptyList();
        }
        List<String> originalStringArray = new ArrayList<>();
        List<Integer> originalSizesArray = new ArrayList<>();

        int hashIndex =  str.indexOf("#");
        String sizesPart = str.substring(0,hashIndex);
        String[] individualSizes = sizesPart.split(",");
        for(String size: individualSizes){
            originalSizesArray.add(Integer.parseInt(size));
        }
        System.out.println("Original Size Array " + originalSizesArray);
        int contentIndex = hashIndex +1;
        for(int size:originalSizesArray){
            originalStringArray.add(str.substring(contentIndex,contentIndex+size));
            contentIndex += size;
        }
        System.out.println("Original String Array " + originalStringArray);

        return originalStringArray;

    }
}
