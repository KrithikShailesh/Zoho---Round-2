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

        

    }
}
