import java.util.*;
public class LeadersStack {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int len=sc.nextInt();

        int[] arr=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        Stack<Integer> s=new Stack();
        s.push(arr[0]);
        

        for(int i=1;i<len;i++){
            if(s.peek()<arr[i]){
                s.pop();
            }
           s.push(arr[i]);
            
        }

        for(Integer i:s){
            System.out.print(i+" ");
        }
    }
    
}
