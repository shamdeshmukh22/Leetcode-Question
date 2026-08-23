class Solution {
    public int CheckIndex(String s){
        return "+-*/".indexOf(s);
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String s:tokens){
            int idx=CheckIndex(s);
              if(idx!=-1){
                    int second=st.pop();
                    int first=st.pop();

                    if(idx==0){
                        st.push(first+second);
                    }
                    else if(idx==1){
                         st.push(first-second);
                    }
                    else if(idx==2){
                         st.push(first*second);
                    }
                    else{
                        st.push(first/second);
                    }
              }
              else{
                st.push(Integer.parseInt(s));
              }
        }
         return Integer.valueOf(st.pop());
    }
}