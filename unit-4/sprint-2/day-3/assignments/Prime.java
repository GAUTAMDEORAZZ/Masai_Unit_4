public class Prime {
    public int[] findAndReturnPrimeNumbers(int[] inputArray){

        int k=0;
        int[] ans= new int[6];

        for(int i=0; i<inputArray.length;i++){
            int count=0;

            for(int j=1;j<=inputArray[i];j++){
                if(inputArray[i]%j==0){
                    count++;
                }
            }
            if(count==2){

                ans[k++]=inputArray[i];

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Prime obj=new Prime();
        int[] arr={10,12,5,50,11,14,15,13};
        int[]  arr2= obj.findAndReturnPrimeNumbers(arr);
       if(arr2.length!=0){
           for(int element:arr2){
               System.out.println(element);
           }
       }
       else {
           System.out.println("empty array");
       }

    }

}
