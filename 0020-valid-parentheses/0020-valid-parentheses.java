class Solution {
    public boolean isValid(String s) {
      Stack<Character>st=new Stack<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='}' && !st.isEmpty()){
            char ch2=st.pop();
            if(!CheckString(ch2,ch)) return false;
        }
        else if(ch==']'  && !st.isEmpty()){
            char ch2=st.pop();
            if(!CheckString(ch2,ch)) return false;
        }
        else if(ch==')'  && !st.isEmpty()){
            char ch2=st.pop();
            if(!CheckString(ch2,ch)) return false;
        }
        else st.push(ch);
      }
      return st.isEmpty();
    }
    public boolean CheckString(char ch,char ch2){
      if(ch=='{' && ch2=='}') return true; 
      if(ch=='(' && ch2==')') return true; 
      if(ch=='[' && ch2==']') return true; 
      return false;
    }
}