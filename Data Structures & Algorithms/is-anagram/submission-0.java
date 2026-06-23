class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] sHash = new int[26];
        int[] tHash = new int[26];

        for(int i = 0; i < s.length(); i++){
            sHash[s.charAt(i) - 'a']++;
            tHash[t.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sHash,tHash))
            return true;

        return false;
    }
}

// lower english alphabet
