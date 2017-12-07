public class EqualArrayElements {
        public int minMoves(int[] nums) {
            int moves = 0;
            int sum = 0;
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            moves = sum - (nums.length * min);
            return moves;
        }
}
