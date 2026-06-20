class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> resultDict = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(resultDict.containsKey(nums[i]) && resultDict.get(nums[i]) == 1){
                return true;
            }
            resultDict.put(nums[i],1);
        }
        return false;
    }
}