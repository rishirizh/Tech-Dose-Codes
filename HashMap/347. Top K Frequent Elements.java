class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        Map<Integer,Integer> d = new HashMap<>();
        for(int i=0;i<len;i++){
            int ele = nums[i];
            d.put(ele,d.getOrDefault(ele,0)+1);
        }
        List<Integer> my = new ArrayList<>(d.keySet());
        // List<Map.Entry<Integer,Integer>> list = new ArrayList<>(d.entrySet());
        // Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
        Collections.sort(my,(i1,i2)->d.get(i2).compareTo(d.get(i1)));
        
        int[] res = new int[k];
        int ptr = 0;
        while (ptr < k){
            res[ptr] = my.get(ptr);
            ptr++;
            
        }
        
        return res;
    }
}