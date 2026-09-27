class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int [nums.length];
       // do this or take different variable such as prefix assign it a value of 1, and inside the first loop set prefix to the result element and update prefix to the prefix*number
        result[0]=1;
        int suffix = 1;
        // store prefix values directly in the result array
        for(int i=1;i<nums.length;i++){
            result[i] = result[i-1]*nums[i-1];
        }

        for(int i=nums.length -1;i>=0;i--){
            result[i] = result[i]*suffix;
            suffix = suffix*nums[i];
        }

        return result;
    }
}  
