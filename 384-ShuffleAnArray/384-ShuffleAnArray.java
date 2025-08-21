// Last updated: 8/21/2025, 12:09:35 PM
class Solution {
    private int[] arr;
    private Random random;
    public Solution(int[] nums) {
        this.arr=nums;
        random = new Random();
    }
    
    public int[] reset() {
        return this.arr;
    }
    
    public int[] shuffle() {
        int shuffled[] = Arrays.copyOfRange(arr, 0, arr.length);
        for(int i= arr.length - 1;i>=0;--i){
            int j=random.nextInt(i+1);
            int temp=shuffled[i];
            shuffled[i]=shuffled[j];
            shuffled[j]=temp;
        }
        return shuffled;
    }
}

