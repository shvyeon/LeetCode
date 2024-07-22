class Solution {
    public int[] twoSum(int[] nums, int target) {

        int sum = 0;
        int[] answer = new int[2];
        System.out.println(nums.length);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;

                    return answer;
                }
            }

        }
        return answer;
    }
}