class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int ans[] = new int[temperatures.length];
        Stack<int[]> st = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            int temp = temperatures[i];
            while(!st.isEmpty() && st.peek()[0] < temp){
                ans[st.peek()[1]] = i - st.peek()[1];
                st.pop(); 
            }
            st.push(new int[]{temp, i});
        }
        return ans;
    }
}
