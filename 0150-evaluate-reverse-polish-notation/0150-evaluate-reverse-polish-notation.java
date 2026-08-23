class Solution {
    public int CheckIndex(String s){
        return "+-*/".indexOf(s);
    }
    public int evalRPN(String[] tokens) {
        Stack<String>st=new Stack<>();
        for(String s:tokens){
            int idx=CheckIndex(s);
              if(idx!=-1){
                   if(st.size()>1){
                    int second=Integer.parseInt(st.pop());
                    int first=Integer.parseInt(st.pop());
                    if(idx==0){
                        st.push(String.valueOf(first+second));
                    }
                    else if(idx==1){
                         st.push(String.valueOf(first-second));
                    }
                    else if(idx==2){
                         st.push(String.valueOf(first*second));
                    }
                    else{
                        st.push(String.valueOf(first/second));
                    }
                   }
              }
              else{
                st.push(s);
              }
        }
        return Integer.valueOf(st.pop());
    }
}