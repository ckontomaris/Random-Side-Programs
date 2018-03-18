import java.util.*;

public class JinaysChallengeUnOptimized{
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Give me a number");
        System.out.println("I'll give you the smallest factor pair sum");
        int number = num.nextInt();

        ArrayList<Integer> pairSum = new ArrayList<Integer>();

        //add each factor pair to array list
        for (int x=1; x<=number; x++){
            int [] pair = new int[2];
            //if they are a factor pair
            if((number % x)==0){
                pairSum.add(x+(number/x));
            }
        }
        //find the smallest pair sum
        int track = pairSum.get(0);

        for(int x=0; x<pairSum.size();x++){
            if(pairSum.get(x)<track){
                track = pairSum.get(x);
            }
        }
        System.out.println(track);
    }

}
