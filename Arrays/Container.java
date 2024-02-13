public class Container {
    public static int maxArea(int[] height) {
        int left = 0 , right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int length = Math.min(height[left],height[right]) , width = (right-left);
            int area = length * width;

            maxArea = Math.max(area,maxArea);
            System.out.println(maxArea);
            if(height[left] < height[right]) left++;
            else right--;

        }
    return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
