import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int arr[] = {3,2,4} , target = 6;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0 ; i < arr.length ; i++){
            int complement = target - arr[i];
            if(hm.containsKey(complement)){
                System.out.print(hm.get(complement) + " " + i);
                break;
            }
        hm.put(arr[i],i);
        }
        
    }
}