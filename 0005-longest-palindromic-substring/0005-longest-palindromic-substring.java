class Solution {
    public String longestPalindrome(String s) {
       
           if (s == null || s.length() < 1) return "";

        String longest = "";

        for(int i=0;i<s.length();i++)
        {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.length() > longest.length() && Ispalindrome(sub) ) {
                    longest = sub;
                }
            }
        }  

        return longest;
        
    }

    public static boolean Ispalindrome(String s)
    {
        int start=0,end=s.length()-1;

          while(start<end)
          {
             if (s.charAt(start) != s.charAt(end)) return false;
            start++;end--;
          }
          return true;
    }
}