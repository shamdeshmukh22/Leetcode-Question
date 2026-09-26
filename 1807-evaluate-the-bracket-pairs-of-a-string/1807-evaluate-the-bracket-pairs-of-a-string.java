class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
    
       HashMap<String,String>map=new HashMap<>();
       for(int i=0;i<knowledge.size();i++){
          String key=knowledge.get(i).get(0),value=knowledge.get(i).get(1);
          map.put(key,value);
       }
       
       StringBuilder sb=new StringBuilder("");
       int i=0,j=0;

       while(i<s.length()){
          char ch=s.charAt(i);
          if(ch=='('){
            j=i+1;
            while(i<s.length() && s.charAt(i)!=')') i++;
            String sub=s.substring(j,i);
            if(map.containsKey(sub)){
                sb.append(map.get(sub));
            }
            else {
                sb.append("?");
            }
          }else{
            sb.append(ch);
          }

          i++;
       }
       return sb.toString();
    }
}