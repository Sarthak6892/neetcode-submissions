class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        return maxKey;
    }
}