class Solution {
    private List<String> happyStrings = new ArrayList<>();
    public String getHappyString(int n, int k) {
        generateHappyStrings("", n);
        return happyStrings.size() < k ? "" : happyStrings.get(k - 1);
    }
    private void generateHappyStrings(String current, int n) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }
      
        for (char c : "abc".toCharArray()) {
            if (current.length() > 0 && current.charAt(current.length() - 1) == c) {
                continue;
            }
            generateHappyStrings(current + c, n);
        }
   
