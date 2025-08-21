// Last updated: 8/21/2025, 12:11:02 PM
class Solution {
    public int largestRectangleArea(int[] heights) {
        return Largest_Histogram(heights);
    }
    static int Largest_Histogram(int[] arr){
        Stack<Integer> st= new Stack<>();
        int ans=0;
        for (int i=0;i< arr.length;i++){
            while (!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if (st.isEmpty()){
                    ans= Math.max(h*r,ans);
                    
                }else {
                    int l=st.peek();
                    int area=h*(r-l-1);
                    ans= Math.max(area,ans);
                    
                }
            }
            st.push(i);
        }
        int r= arr.length;
        while (!st.isEmpty()){
            int h=arr[st.pop()];
            // int r=i;
            if (st.isEmpty()){
                ans= Math.max(h*r,ans);

            }else {
                int l=st.peek();
                int area=h*(r-l-1);
                ans= Math.max(area,ans);

            }
        }
        return ans;
    }
}