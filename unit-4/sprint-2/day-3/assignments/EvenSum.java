public class EvenSum {
    public static void main(String[] args) {

        int arr[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };

//        int [][]sum=new int[3][3];
        int i,j;

        for(i=0; i<3; i++){
            int sum=0;
            for(j=0;j<3;j++){
                if(arr[j][i]%2==0){
                    sum+=arr[j][i];
                }
            }
            System.out.println(sum);
        }
    }
}
