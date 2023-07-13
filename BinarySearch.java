import java.util.*;
class BinarySearch
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int s , mid=-1 , lb , ub,c=0;
        int arr[]={5,7,10,12,13,14,17,20,35};
        lb=0;// position of first value
        ub=8;// - position of last value ,array length-1
        System.out.println("Enter the search value");
        s=in.nextInt();
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]==s)
            {
                c=1;
                break;
            }
            else if (arr[mid]<s)
            {
                lb=mid+1;
            }
            else
            {
                ub=mid-1;
            }
        }
        if(c==0)
        {
            System.out.println("Value not found");
        }
        else
        {
            System.out.println("Value found at "+(mid+1)+ " position");
        }
    }
}