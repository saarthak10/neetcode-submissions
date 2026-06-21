class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>resultMap = new HashMap();
        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
            if(resultMap.containsKey(complement)){
                int[] arr = {resultMap.get(complement),i};
                return arr;
            }
            resultMap.put(nums[i],i);
        }
        
        int[] newArr = {};
        return  newArr;
    }
}
