class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        if(s.length() == 1){
            return 1;
        }
        StringBuilder currString = new StringBuilder();
        
        // iterate through each character
        for(int i = 0; i < s.length() ; i++) {
            int currLongest = 1;
            currString.append(s.charAt(i));
            for(int j = i+1; j < s.length() ; j++){
                String currLetter = Character.toString(s.charAt(j));
                if (currString.toString().contains(currLetter)){
                    if (currLongest > longest){
                        longest = currLongest;
                    }
                    currLongest = 0;
                    currString = new StringBuilder();
                    break;
                }
                currString.append(s.charAt(j));
                currLongest++;
                if (currLongest > longest){
                        longest = currLongest;
                }
            }
        }
        return longest;
        
    }
}

// MAIN CLASS PROVIDED BY LEETCODE

public class MainClass {
    public static String stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            int ret = new Solution().lengthOfLongestSubstring(s);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}