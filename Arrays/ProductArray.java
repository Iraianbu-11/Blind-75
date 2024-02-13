import java.util.Arrays;
public class ProductArray {
        public static int[] productExceptSelf(int[] nums) {
            int res[] = new int[nums.length];
            int leftSum[] = new int[nums.length];
            int rightSum[] = new int[nums.length];
            leftSum[0] = 1 ;
            rightSum[nums.length-1] = 1;
            for(int i=1;i<nums.length;i++){
                leftSum[i] = leftSum[i-1] * nums[i-1];
            }
    
             for(int i=nums.length-2;i>=0;i--){
                rightSum[i] = rightSum[i+1] * nums[i+1];
            }
    
            for(int i=0;i<nums.length;i++){
                res[i] = leftSum[i] * rightSum[i];
            }
        return res;
        }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}