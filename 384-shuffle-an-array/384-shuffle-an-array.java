class Solution {
    
    int[] array;
    int[] original;
    
    Random rd = new Random();
    
    int getInteger(int a,int b){
        return rd.nextInt(b-a)+a;
    }
    
    void swap(int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;
    }

    public Solution(int[] nums) {
        this.array = nums;
        this.original = nums.clone();
        
    }
    
    public int[] reset() {
        this.array = original;
        original = original.clone();
        return original;
    }
    
    public int[] shuffle() {
        for(int i=0;i<array.length;i++){
            swap(i,getInteger(i,array.length));
        }
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */