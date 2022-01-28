class Solution {
    public int firstUniqChar(String s) {
        int[] hash=new int[26];
        int len=s.length();
        char[] arr = s.toCharArray();
        for (char c : arr) {
        	hash[c - 'a']++;
        }
        for(int i=0;i<len;i++){
            
            if (hash[arr[i]-'a']==1)
                return i;
        }
        return -1;
    }
}
