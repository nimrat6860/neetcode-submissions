class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            int currLen = 1;
            int currNum = num;
            if (!set.contains(currNum - 1)) {
                while (set.contains(currNum + 1)) {
                    currLen++;
                    currNum += 1;
                }
            }
            maxLength = Math.max(maxLength, currLen);
        }
        return maxLength;
    }
}
