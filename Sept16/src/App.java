import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] testA = new int[]{515, 341, 98, 44, 211};
        System.out.println("=========Coding Challenge a=========");
        System.out.println("Original: "+Arrays.toString(testA));
        reorderDigits(testA, "asc");
        System.out.println("New (asc): "+Arrays.toString(testA));
        testA = new int[]{515, 341, 98, 44, 211};
        System.out.println("Original: "+Arrays.toString(testA));
        reorderDigits(testA, "desc");
        System.out.println("New (desc): "+Arrays.toString(testA));

        System.out.println("=========Coding Challenge b=========");
        int[] testB = new int[]{2,8,4,1};
        System.out.println(Arrays.toString(testB)+" can partition is "+canPartition(testB));
        testB = new int[]{-1,-10,1,-2,20};
        System.out.println(Arrays.toString(testB)+" can partition is "+canPartition(testB));

    }

    // Coding Challenge a
    public static void reorderDigits(int[] arr, String order){

        for(int i = 0; i < arr.length; i++){
            int temp = arr[i];
            List<Integer> digits = new ArrayList<>();

            while(temp > 0){
                digits.add(temp % 10);
                temp = temp / 10;
            }
            if(order.equals("asc")){
                Collections.sort(digits);
            }
            else if(order.equals("desc")){
                Collections.sort(digits, Collections.reverseOrder());
            }
            else{
                System.out.println("Please enter asc or desc");
                break;
            }

            StringBuilder str = new StringBuilder();
            for(int x: digits){
                str.append(x);
            }
            arr[i] = Integer.parseInt(new String(str));
        }
        
    }



    // Coding Challenge b
    public static boolean canPartition(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int target = arr[i];
            int product = 1;
            for(int j = 0; j < arr.length; j++){
                if(j != i){
                    product *= arr[j];
                }
            }
            if(product == target){
                return true;
            }
        }
        return false;
    }
}
