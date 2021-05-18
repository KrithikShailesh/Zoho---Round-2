import java.util.*;
import static java.lang.System.*;
public class MaximumProfit {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        out.println("Enter the number of days:");
        int days=sc.nextInt();

        int[] stocks=new int[days];
        out.println("Enter the stock price for each day:");

        for(int i=0;i<days;i++){
            stocks[i]=sc.nextInt();
        }

        sc.close();
        
        int min=stocks[0],minIndex=0;

        for(int i=0;i<days;i++){

            if(stocks[i]<min){
                min=stocks[i];
                minIndex=i;
            }

        }

        int max=stocks[minIndex];
        for(int i=minIndex;i<days;i++){

            if(stocks[i]>max){
                max=stocks[i];
            }

        }

        System.out.println(max-min);



    }
    
}
