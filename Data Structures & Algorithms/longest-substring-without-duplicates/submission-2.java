// O(n^2)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <String, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++)
        {
            String sb = "";
            for(int j = i; j < s.length() ; j++)
            {
                char ch = s.charAt(j);
                int present = sb.indexOf(ch);
                System.out.println(ch + " " + present);
                if(present != -1) break;
                // sb.append(s.charAt(j));
                sb += ch;
            }
            maxLen = Math.max(maxLen, sb.length());

        }
        return maxLen;
    }
}