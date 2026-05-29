class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int leftProduct[] = new int[n];
        leftProduct[0] = 1;
        for(int i = 0; i < n - 1; i++){
            leftProduct[i + 1] = leftProduct[i] * nums[i]; 
        }
        int rightProduct = 1;
        int ans[] = new int[n];
        for(int i = n - 1; i >= 0; i--){
            ans[i] = leftProduct[i] * rightProduct;
            rightProduct *= nums[i];
        }
        return ans;
    }
}  
