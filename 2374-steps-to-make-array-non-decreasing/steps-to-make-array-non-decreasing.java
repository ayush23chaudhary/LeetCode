class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{nums[0], 0});
        int steps = 0;
        for (int i = 1; i < nums.length; i++) {
            int temp = 0;
            while (!stack.isEmpty() && stack.peek()[0] <= nums[i]) {
                temp = Math.max(temp, stack.peek()[1]);
                stack.pop();
            }
            if (!stack.isEmpty()) {
                temp += 1;
            } else {
                temp = 0;
            }
            steps = Math.max(steps, temp);
            stack.push(new int[]{nums[i], temp});
        }
        return steps;
    }
}