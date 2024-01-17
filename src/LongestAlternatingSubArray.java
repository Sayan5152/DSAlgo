public class LongestAlternatingSubArray {
    public static void main(String args[]) {
        int[] nums = new int[]{2,7,4,5};
        int threshold = 8;
        
        System.out.println(longestAlternatingSubarray(nums, threshold));
    }

    private static int longestAlternatingSubarray(int[] nums, int th) {
        int right=0, left=0, res=0;

        while(right < nums.length) {
            while(left < nums.length && (nums[left] % 2 != 0 || nums[left] > th )) {
                left++;
            }
            if(left == nums.length) break;
            right = left;

            while(right+1 < nums.length && (nums[right+1]%2 != nums[right]%2 && nums[right+1] <= th)) {
                right++;
            }
            res = Math.max(res, right-left+1);
            right++;
            left=right;
        }
        return res;
    }
}
