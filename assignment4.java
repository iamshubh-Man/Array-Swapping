public class assignment4 
{
    public static void main(String[] args)
    {
        int arr[] = {12,13,23,45,56,43,44,55,33,22};
        for(int i=0;i<arr.length-1;i+=2)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}