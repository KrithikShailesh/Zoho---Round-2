public class LeadersFromLast {

    public static void main(String[] args){

        int[] arr={16,17,4,3,5,4,6,2};

        int len=arr.length;

        int max_right=arr[len-1];

        int[] res=new int[len];
        int ind=0;

        for(int i=len-2;i>=0;i--){

            if(max_right <= arr[i]){

                max_right=arr[i];
                res[ind]=arr[i];
                ind++;

            }

        }

        for(int i=ind-1;i>=0;i--){
            System.out.print(res[i]+" ");
        }
        System.out.print(arr[len-1]);

    }
    
}
