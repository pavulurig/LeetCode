class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> a = new HashSet<>();
       
        Set<Integer> b = new HashSet<>();
    
        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            b.add(nums2[i]);
        }
         Set<Integer> aa = new HashSet<>(a);
        Set<Integer> bb = new HashSet<>(b);
        List<List<Integer> > li = new ArrayList<List<Integer>>();
        
        aa.removeAll(b);
        List<Integer> LL = new ArrayList<Integer>();
        LL.addAll(aa);
        bb.removeAll(a);
        List<Integer> LLB = new ArrayList<Integer>();
        LLB.addAll(bb);
        li.add(LL);
        li.add(LLB);
        return li;
        
    }
}