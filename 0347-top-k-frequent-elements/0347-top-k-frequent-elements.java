class EntryComparator implements Comparator<Map.Entry<Integer, Integer>>{
    @Override
    public int compare(Map.Entry<Integer, Integer> entry1, Map.Entry<Integer, Integer> entry2){
        return entry1.getValue().compareTo(entry2.getValue());
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Collections.reverseOrder(new EntryComparator()));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}