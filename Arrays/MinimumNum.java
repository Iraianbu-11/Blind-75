public class MinimumNum {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int low = 0 , high = arr.length-1;
        while(low<high){
            int mid = low + (high-low)/2;
            System.out.println(mid + " " + arr[mid] + " " +low + " " +  high);
            if(arr[mid] < arr[high]) high = mid;
            else low = mid+1;
            System.out.println(mid + " " +arr[mid] + " " +low + " " +  high);
        }
    System.out.println(arr[low]);
    }
}
