class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> d = new HashMap<>();
        if (s.length()==0 || s.length()==1)
            return false;
        d.put(')','(');
        d.put(']','[');
        d.put('}','{');
        int len=s.length();
        for(int i=0;i<len;i++){
            
            char ch = s.charAt(i);
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if (!stack.empty()){
                    // System.out.println(stack);
                    char t = stack.pop();
                    char res = (char)d.get(ch);
                    if (t!=res){
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
            
        }
        if (!stack.empty())
            return false;
        return true;
    }
}
