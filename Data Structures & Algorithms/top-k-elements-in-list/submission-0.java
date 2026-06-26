class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int count : nums){
            map.put(count, map.getOrDefault(count,0) + 1);
        }

        Queue<Integer> priorityQueue  = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        for(int values : map.keySet()){
            priorityQueue.add(values);

            if(priorityQueue.size() > k) priorityQueue.poll();
        }

        int result[] = new int[k];
        while(k-- > 0){
            result[k] = priorityQueue.poll();
        }
        return result;
    }
}
