import java.util.*;

public class JinaysChallenge{
    public static void main(String [] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Give me a number");
        System.out.println("I'll give you the smallest factor pair sum");
        int number = num.nextInt();
        int sum = number+1;

        for(int x =1; x<=(number/2); x++){
            if (((number % x )== 0) && (x+(number/x))<sum){
                sum = x +(number/x);
            }
        }

        System.out.println(sum);
    }

}
