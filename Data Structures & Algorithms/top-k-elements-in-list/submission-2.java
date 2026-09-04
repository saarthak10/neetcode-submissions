class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> occurenceMap = new HashMap();
        int[] resultArray = new int[k];
        for(int i=0;i< nums.length;i++){
            if(occurenceMap.containsKey(nums[i])){
                occurenceMap.put(nums[i], occurenceMap.get(nums[i]) + 1);
            }else{
                occurenceMap.put(nums[i],1);
            }
        }

        for(int j=0;j<k;j++){
            int maxCount = 0;
            Map.Entry<Integer, Integer> maxEntry = Collections.max(occurenceMap.entrySet(), Map.Entry.comparingByValue());
            resultArray[j] = maxEntry.getKey();
            occurenceMap.put(maxEntry.getKey(),0);
        }
        return resultArray;

    }
}
