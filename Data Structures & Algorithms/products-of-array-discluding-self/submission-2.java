class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]result = new int[n];
        int[]prefix = new int[n];
        //Nothing is left of 0th index
        prefix[0] = 1;
        int[]suffix = new int[n];
        //Nothing is right of last index
        suffix[n-1] = 1;
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        for(int j=nums.length -2;j>=0;j-- ){
            suffix[j] = suffix[j+1]*nums[j+1];
        }

        for(int k=0;k<nums.length;k++){
            result[k] = prefix[k]*suffix[k];
        }

        return result;
    }
}  
