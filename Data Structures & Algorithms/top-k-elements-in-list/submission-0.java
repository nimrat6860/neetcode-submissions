class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Integer arr[] = map.keySet().toArray(new Integer[0]);
        Arrays.sort(arr,(a,b) -> {
            int freq1 = map.get(a);
            int freq2 = map.get(b);
            return freq2 - freq1;
        });
        for(int i = 0; i < k; i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}
