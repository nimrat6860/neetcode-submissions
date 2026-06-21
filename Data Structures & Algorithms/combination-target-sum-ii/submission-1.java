class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, curr, result, 0, target);
        return result;
    }
    public void backtrack(int idx, int[] candidates, List<Integer> curr, List<List<Integer>> result,
        int currSum, int target) {
        if (currSum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (currSum > target || idx >= candidates.length)
            return;
        curr.add(candidates[idx]);
        backtrack(idx + 1, candidates, curr, result, currSum + candidates[idx], target);
        curr.remove(curr.size() - 1);
        while (idx + 1 < candidates.length && candidates[idx] == candidates[idx + 1]) {
            idx++;
        }
        backtrack(idx + 1, candidates, curr, result, currSum, target);
    }
}
