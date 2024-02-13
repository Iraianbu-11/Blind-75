import java.util.HashSet;

public class ContainsDup {
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
        HashSet<Integer> set = new HashSet<>();
        for(int nums : arr){
            if(set.contains(nums)) {
                System.out.println("Contains Duplicate");
                break;
            }
        set.add(nums);
        }
    }
}
