class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int left = 0, right = 0, maxLen = 1;

        for(int i = 0; i < n; i++)
        {
            // odd length substring check
            int j = i - 1, k = i + 1;
            int count = 1;
            while(j >= 0 && k < n && s.charAt(j) == s.charAt(k))
            {
                count +=2;
                --j;
                ++k;
            }
            
            if(count >= maxLen)
            {
                maxLen = count;
                left = ++j;
                right = --k;
            }

            // even length substring check;
             count = 0;
            j = i;
            k = i + 1;
            
            while(j >= 0 && k < n && s.charAt(j) == s.charAt(k))
            {
                count += 2;
                --j;
                ++k;
            }
            if(count >= maxLen)
            {
                maxLen = count;
                left = ++j;
                right = --k;
            }
        }

        String ns = "";
        for(int i = left; i <= right; i++)
        {
            ns += s.charAt(i);
        }

        return ns;
    }
}
