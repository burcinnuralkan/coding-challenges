class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0, left = 0; right < n; right++){
            char curr = s.charAt(right);
            if(map.containsKey(curr)){
                left = Math.max(map.get(curr),left);
            }
            map.put(curr,right+1);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}