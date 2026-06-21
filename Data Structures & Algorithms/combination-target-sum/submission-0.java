class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, curr, result, 0, target);
        return result;
    }
    public void backtrack(int idx, int[] nums, List<Integer> curr, List<List<Integer>> result, int currSum, int target) {
        if (currSum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if(currSum > target || idx >= nums.length)
            return;
        curr.add(nums[idx]);
        backtrack(idx, nums, curr, result, currSum + nums[idx], target);
        curr.remove(curr.size() - 1);
        backtrack(idx + 1, nums, curr, result, currSum, target);
    }
}
