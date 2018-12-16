// Question link: https://leetcode.com/problems/assign-cookies/description/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int contentCount = 0;
        Arrays.sort(s);
        for(int i=0; i<g.length; i++) {
            int currGreed = g[i];
            for(int j = 0; j < s.length; j++){
                if(currGreed <= s[j]) {
                    contentCount++;
                    s[j] = -1;
                    break;
                }
            }
        }
        return contentCount;
    }
}

// MAIN CLASS PROVIDED BY LEETCODE
public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] g = stringToIntegerArray(line);
            line = in.readLine();
            int[] s = stringToIntegerArray(line);
            
            int ret = new Solution().findContentChildren(g, s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}