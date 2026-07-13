class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] HashArray = new int[26];
            for(int i = 0; i < s.length(); i++){
                HashArray[s.charAt(i) - 'a']++;
            }
            String HashCode = Arrays.toString(HashArray);
            map.computeIfAbsent(HashCode, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
