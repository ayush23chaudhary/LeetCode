class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        
        if(digits[n-1]==9){
            int l=n-1;
            while(digits[l]==9){
                if(l==0){
                    int[] arr= new int[n+1];
                    arr[0]=1;
                    return arr;
                }
                digits[l]=0;
                // digits[l-1]+=1;
                l--;
            }
            digits[l]++;

        }
        else{
            digits[n-1]++;
        }
        return digits;
        
    }
}