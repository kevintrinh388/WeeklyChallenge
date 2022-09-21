import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=========Coding Challenge a=========");
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> sampleA = new ArrayList<>();
        sampleA.add(1);
        sampleA.add(2);
        sampleA.add(3);
        ArrayList<Integer> sampleB = new ArrayList<>();
        sampleB.add(10);
        sampleB.add(15);
        sampleB.add(5);
        ArrayList<Integer> sampleC = new ArrayList<>();
        sampleC.add(100);
        sampleC.add(999);
        sampleC.add(500);
        list.add(sampleA);
        list.add(sampleB);
        list.add(sampleC);
        secondMax(3,list);

        System.out.println("=========Coding Challenge b=========");
        ArrayList<String> cases = new ArrayList<>();
        cases.add("ab1231da");
        sumDigit(1, cases);

    }



    // coding challenge a
    public static void secondMax(int N, ArrayList<ArrayList<Integer>> list){
        for(ArrayList<Integer> i : list){
            Collections.sort(i);
            System.out.println(i.get(1));
        }
    }



    // coding challenge b
    public static void sumDigit(int T, ArrayList<String> cases){
        for(String i : cases){
            int sum = 0;
            for(char c: i.toCharArray()){
                if(Character.isDigit(c)){
                    sum += Integer.parseInt(c+"");
                }
            }
            System.out.println(sum);
        }
    }
}
