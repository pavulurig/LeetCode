class SparseVector {
    Map<Integer,Integer> hmap ;
    SparseVector(int[] nums) {
        hmap = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                hmap.put(i,nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int ans = 0;
        for(Integer a: this.hmap.keySet()){
            if(vec.hmap.containsKey(a)){
                ans+=this.hmap.get(a)* vec.hmap.get(a);
            }
        }
        return ans;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);