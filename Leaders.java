import java.util.*;

public class Leaders {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the array length:");
        int len=sc.nextInt();

        int[] arr=new int[len];
        int flag=0;

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        System.out.println("The Leaders are : ");

        for(int i=0;i<len;i++){
            
            for(int j=i+1;j<len;j++){

                if(arr[i]>arr[j]){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }

            }
            if(i==len-1){
                flag=1;
            }
            if(flag==1){
                System.out.print(arr[i]+" ");
            }

        }
    }
    
}
