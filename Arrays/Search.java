public class Search {
    public static int search(int[] arr, int target) {
        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;

            if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                 if(target <= arr[high] && arr[mid] < target){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0));
        
    }
}
