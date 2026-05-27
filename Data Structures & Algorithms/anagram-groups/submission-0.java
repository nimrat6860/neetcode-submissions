class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char s[] = str.toCharArray();
            Arrays.sort(s);
            String hashKey = new String(s);
            map.putIfAbsent(hashKey, new ArrayList<>());
            map.get(hashKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
