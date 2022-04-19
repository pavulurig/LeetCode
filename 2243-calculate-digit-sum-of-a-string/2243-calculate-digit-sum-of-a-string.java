class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k)
            return s;
        StringBuilder r = new StringBuilder();
        for(int i = 1, sum = 0; i <= s.length(); i++){
            sum += s.charAt(i - 1) - '0';
            if(i % k == 0 || i == s.length()){
                r.append(sum);
                sum = 0;
            }
        }
        return digitSum(r.toString(), k);
    }
}