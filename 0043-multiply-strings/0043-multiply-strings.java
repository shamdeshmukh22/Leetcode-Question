class Solution {
    public String multiply(String n1, String n2) {
       if(n1.equals("0") || n2.equals("0"))
            return "0";
        ArrayList<String>list=new ArrayList<>();
         int j=n2.length()-1;
         while(j>=0){
        StringBuilder sb=new StringBuilder("");
            int val2=n2.charAt(j)-'0',i=n1.length()-1;
            int count=0,num=0;
            while(i>=0){
               int val=n1.charAt(i)-'0';
               int total=val2*val+count;
               if(total>9){
                    sb.insert(0,total%10);
                    count=total/10;   
               }
               else{
                     sb.insert(0,total);
                     count=0;
               }

               i--;
            }
             if (count > 0) {
                sb.insert(0,count);
            }
            for(int k=n2.length()-1;k>j;k--){
                     sb.insert(sb.length(),0);
            }
           list.add(sb.toString());
           j--;
         }
       String result = "0";
        for (String s : list) {
            result = addStrings(result, s);
        }
        return result;
    }
     public String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i--) - '0';
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}