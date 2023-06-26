public class Nonrepetingchar {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        int index = firstUniqChar(str);
        System.out.println("Index of the first non-repeating character: " + index);
    }
}
