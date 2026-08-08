class Solution {
    public String arrangeWords(String text) {

        text=text.toLowerCase();
        String str[]=text.split(" ");

        Arrays.sort(str,(a,b)-> Integer.compare(a.length(),b.length()));
        StringBuilder sb=new StringBuilder("");
        str[0]=str[0].substring(0,1).toUpperCase()+str[0].substring(1);
        for(String s:str){
           sb.append(s+" ");
        }
        return sb.toString().trim();
    }
}