class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        if (len==0)
            return new ArrayList<>();
        
        Map<String,List<String>> d = new HashMap<>();
        for(int i=0;i<len;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            d.putIfAbsent(str,new ArrayList<>());
            d.get(str).add(strs[i]);
        }
        List<List<String>> res = new ArrayList<>(d.values());
        return res;
        
        
    }
}
