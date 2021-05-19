import java.util.*;

public class CharOccu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        sc.close();
        
        int len=str.length();

        int[] count=new int[len];
        for(int i=0;i<len;i++){
            count[i]=1;
        }
        String cmp="";

        for(int i=0;i<len-1;i++){
            cmp+=str.charAt(i);

            for(int j=0;j<cmp.length();j++){
                if(str.charAt(i+1)==str.charAt(j)){
                    count[i]++;
                }
            }

        }

       String res=""+count[len-1];
        for(int i=0;i<len-1;i++){
            res+=count[i];
        }

        System.out.println(res);

        /* first iteration
            i=0
            cmp=Z
            str.charAt(i+1)='o'
            so o is not equal to Z
            
            Secnd iteration
            Zo
            h!=o
            h!=Z

            Third iteration
            Zoh
            o!=Z
            o==o
            count++
            o!=h
        */
        

    }
}
