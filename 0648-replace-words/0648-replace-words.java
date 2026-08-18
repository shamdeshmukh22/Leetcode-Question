class Solution {
    public String replaceWords(List<String> list, String sentence) {
         boolean last=true;
           Set<String> set = new HashSet<>(list);
        StringBuilder sb=new StringBuilder();
        StringBuilder sub=new StringBuilder();

        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch==' '){
                sb.append(sub+" ");
                sub.setLength(0);
           }
//            System.out.println(list);
          else {
                sub.append(ch);
                if(set.contains(sub.toString())){
                    //System.out.println(sub);
                    while (i < sentence.length() && ch != ' ') {
                        ch = sentence.charAt(i++);
                    }
                    i--;
                  if(i==sentence.length()) last=false;
                    sb.append(sub+" ");
                    sub.setLength(0);
                }
            }

        }
      if(last) sb.append(sub);
       return sb.toString().trim();
    }
}
