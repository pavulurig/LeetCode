class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int totalWidth = 0;
        int lastWidth=0;
        int lines=0;
        for(int i=0;i<s.length();){
            int index = s.charAt(i)-'a';
            if(totalWidth+widths[index]<=100){
                totalWidth+=widths[index];
                i++;
                lastWidth= totalWidth;
            }else{
                lines++;
                totalWidth=0;
            }
        }
        //System.out.println(totalWidth);
        int result[] = new int[2];
        result[0]= lines+1;
        result[1]=lastWidth;
        return result;
    }
}