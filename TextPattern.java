import java.util.*;
public class TextPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        String pattern=sc.next();

        sc.close();

        char condition=pattern.charAt(0);
        
        String pat="";
        for(int i=1;i<pattern.length()-1;i++){
            pat+=pattern.charAt(i);
        }

        //'?' matches any single character 
        if(condition=='?'){

            char[] arr=pat.toCharArray();
            int ind=0;
            int flag=0;

            for(int i=0;i<str.length();i++){
                if(arr[ind]==str.charAt(i)){
                    flag=1;
                    break;
                }
            }

            if(flag==1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

        }
        else{

            int len=pat.length();
            String cmp="";
            int flag=0;
            for(int i=0;i<str.length()-pat.length();i++){
                for(int j=i;j<len+i;j++){
                    cmp+=str.charAt(j);
                }
                if(cmp.equals(pat)){
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
                cmp="";
                
            }

            if(flag==1){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        
    }
    
}
