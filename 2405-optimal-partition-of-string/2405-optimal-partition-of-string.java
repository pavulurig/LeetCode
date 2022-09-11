class Solution {
    public int partitionString(String s) {
        HashSet<Character> hset = new HashSet<Character>();
        int count = 0;
        for(int i=0;i<s.length();){
            if(!hset.contains(s.charAt(i))){
                hset.add(s.charAt(i));
                i++;
            }else{
                hset = new HashSet<Character>();
                count++;
            }
        }
        return count+1;
    }
}