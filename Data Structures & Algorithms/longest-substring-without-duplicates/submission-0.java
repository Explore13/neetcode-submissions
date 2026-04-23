class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <String, Integer> map = new HashMap<>();
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s.length() ; j++)
            {
                char ch = s.charAt(j);
                int present = sb.indexOf(Character.toString(ch));
                System.out.println(ch + " " + present);
                if(present != -1) break;
                sb.append(s.charAt(j));
            }
            maxLen = Math.max(maxLen, sb.length());

        }
        return maxLen;
    }
}