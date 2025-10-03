class Solution {
    public int candy(int[] ratings) {
        int candy=1;
        int i=1;
        int n=ratings.length;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                candy++;
                i++;
                continue; 
            }
            //slope bdhega / ghtega
            int up=1;
            while(i<n && ratings[i]>ratings[i-1]){
                up++;
                candy+=up;
                i++;
            }

            //-
            int down=1;
            while(i<n && ratings[i]<ratings[i-1]){
                candy+=down;
                down++;
                i++;
            }

            if(up<down){
                candy+=(down-up);
            }
        }
        return candy;
    }
}