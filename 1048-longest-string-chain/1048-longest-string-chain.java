class Solution {
    public int longestStrChain(String[] words) {
        
        Arrays.sort(words,(a,b)->a.length() - b.length());
        HashMap<String,Integer> hmap = new HashMap<>();
        int ans=1;
        for(String word: words){
            hmap.put(word,1);
            for(int i=0;i<word.length();i++){
                String s = word.substring(0,i)+word.substring(i+1);
                if(hmap.containsKey(s) && hmap.get(s)+1 > hmap.get(word)){
                    hmap.put(word,hmap.get(s)+1);
                }
            }
            ans=Math.max(ans,hmap.get(word));
        }
        return ans;
    }
}