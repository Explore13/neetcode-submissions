class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        if(m!=n) return false;

        int []arr = new int[26];
        for(int i = 0; i<m;i++){
            int index = s.charAt(i) - 'a';
            arr[index]++;
        }
        for(int i = 0; i<n;i++){
            int index = t.charAt(i) - 'a';
            arr[index]--;
        }

        for(int i = 0; i<arr.length;i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}
