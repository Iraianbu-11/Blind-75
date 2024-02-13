public class MaxProductSubArray {
    public static int maxProduct(int[] nums) {
        int left = 1 , right = 1 , res = nums[0];
        for(int i=0;i<nums.length;i++){
            left = (left == 0) ? 1 : left;
            right = (right == 0) ? 1 : right;
 
            left*=nums[i];
            right*=nums[nums.length-i-1];
 
            res = Math.max(res , Math.max(left,right));
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,-2,-5,6,-1,4};
        System.out.println(maxProduct(nums));
    }
}
