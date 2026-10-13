
// Brute force solution
class Solution {
    public boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = t.toCharArray();
        for (int i = 0; i < s.length(); i++){
            boolean found = false;

            for (int j = 0; j < chars.length; j++){
                if (s.charAt(i) == chars[j]){
                    chars[j] = '#'; // mark as read
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}

// HashMap solution
class Solution {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (char c : t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}