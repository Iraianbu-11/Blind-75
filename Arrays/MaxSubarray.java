public class MaxSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int currSum = 0 , maxSum = Integer.MIN_VALUE;
        for(int nums : arr){
            currSum+=nums;
            maxSum = (currSum > maxSum) ? currSum : maxSum;
            if(currSum < 0) currSum = 0;
        }
    System.out.println("The Subarray with Largest Sum is " + maxSum);
    }
}
