public class BuyStocks {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int min = Integer.MAX_VALUE , res = 0 , price = 0;
        for(int n : arr){
            if(n < min) min = n;
            price = n - min;
            if(res < price) res = price;

            System.out.println(min + " " + price + " " + res);
        }
   // System.out.println(res);
    }
}
