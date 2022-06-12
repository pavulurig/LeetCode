class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        //TimeComplexity : (n)
        int a[] = new int[101];
        int b[] = new int[101];
        for(int i=0;i<nums1.length;i++){
            a[nums1[i]]++;
            b[nums2[i]]++;
        }
        int i=0,j=100;
        int sum=0;
        while(i<101 && j>=0){
            if(a[i] == 0&&b[j]==0) {
                i++;j--;
            }
            else if(a[i]==0) {
                i++;
            }
            else if(b[j]==0) {
                j--;
            }
            else{
                sum+=i*j;
                a[i]-=1;
                b[j]-=1;
                    //i++;
                    //j--;
                
            }
                
        }
        return sum;
    }
}