class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 2) return s;

        int n = s.length();

        int start = 0, end = 0, maxLen = 0;

        for(int i = 0; i < n; i++)
        {
            int len_1 = expand(s, i, i+1); // even
            int len_2 = expand(s, i-1, i+1); // odd

            if(len_1 > len_2 && maxLen < len_1) {
                start = i - (len_1 / 2) + 1;
                end = i + (len_1 / 2);
                maxLen = len_1;
            }else if(maxLen < len_2){
                maxLen = len_2;
                start = i - (int) (len_2 / 2);
                end = i + (int) (len_2 / 2);
            }
        }
            
        return s.substring(start, end + 1);
    }

    private static int expand(String s, int l, int r)
    {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            --l;
            ++r;
        }

        return r - l - 1;
    }
}
