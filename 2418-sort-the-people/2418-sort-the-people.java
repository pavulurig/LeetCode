class Solution {
    class Student{
        String name;
        int height;
    }
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Student> pq = new PriorityQueue<Student>((Student a,Student b)-> b.height - a.height);
        for(int i=0;i<heights.length;i++){
            Student a = new Student();
            a.name = names[i];
            a.height = heights[i];
            pq.add(a);
        }
        String ans[] = new String[heights.length];
        int i=0;
        while(!pq.isEmpty()){
            String a = pq.poll().name;
            ans[i]=a;
            i++;
            
        }
        
        
        return ans;
            
    }
}