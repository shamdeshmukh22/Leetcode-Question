class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
       for(char ch:s.toCharArray()){
         if(ch=='{' ||ch=='(' || ch=='['){
            st.push(ch);
         }
       else{
          if(st.isEmpty()) return false;
           else if(CheckString(ch,st.pop())) return false;
        }
       }
        return st.isEmpty();
    }
    public boolean CheckString(char ch,char ch2){
        if(ch=='}' && ch2=='{') return false;
        if(ch==']' && ch2=='[') return false;
        if(ch==')' && ch2=='(') return false;
        return true;
    }
}