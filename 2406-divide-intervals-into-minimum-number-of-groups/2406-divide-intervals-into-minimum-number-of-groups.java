class Solution {
    public int minGroups(int[][] intervals) {
        // Arrays.sort(intervals,(a,b)-> a[1] == b[1]? a[0]-b[0]: a[1]-b[1]);
        Arrays.sort(intervals,(a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int[] arr: intervals){
            //System.out.println(arr[0]+" "+arr[1]);
            if(pq.size()>0 && pq.peek()<arr[0]){
                 pq.remove();
            }
            pq.add(arr[1]);
        }
        return pq.size();
    }
}