// Last updated: 8/21/2025, 12:11:12 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col= matrix[0].length;
        int r=0;
        for(int i=0;i<row;i++){
            if(target<=matrix[i][col-1]){
                r=i;
                break;
            }
        }
        int lo=0;
        int hi=col-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;;
            if(matrix[r][mid]>target){
                hi=mid-1;
            }
            else if(matrix[r][mid]==target){
                return true;
            }
            else{
                lo=mid+1;
            }
        }
        return false;
    }
}