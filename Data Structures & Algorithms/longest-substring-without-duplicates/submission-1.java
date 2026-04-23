class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, n = s.length(), maxLen = 0;

        while(r < n)
        {
            char ch = s.charAt(r);
            if(map.get(ch) != null && map.get(ch) >= l) l = map.get(ch) + 1;
            map.put(ch, r);
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}
