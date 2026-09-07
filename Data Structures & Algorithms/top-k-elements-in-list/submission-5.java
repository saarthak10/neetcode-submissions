class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> occurenceMap = new HashMap();
        int[] resultArray = new int[k];
        // Create an array , in which each slot is a list of integers mainly done because there can more than one number with same frequency
        List<Integer>[] bins = new List[nums.length +1];
        for(int i=0;i< nums.length;i++){
            if(occurenceMap.containsKey(nums[i])){
                occurenceMap.put(nums[i], occurenceMap.get(nums[i]) + 1);
            }else{
                occurenceMap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:occurenceMap.entrySet()){
            int frequency = entry.getValue();
            if(bins[frequency] == null){
                bins[frequency] = new ArrayList<>();
            }
            bins[frequency].add(entry.getKey());
        }

        int limit=0;
        for(int i=bins.length-1;i>=0;i--){
            if(bins[i]!= null && limit < k){
                for(int j =0;j<bins[i].size();j++){                    
                    resultArray[limit] = bins[i].get(j);
                    limit++;
                    if(limit == k){
                        return resultArray;
                    }
                }
                    

            }

        }

        return resultArray;
    }
}
