import java.util.*;
class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int m[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            m[i]=sc.nextInt();
        }
        //Bubble Sort Algorithm
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(m[j]>m[j+1])
                {
                    //swap arr[j] and arr[j+1]
                    int temp=m[j];
                    m[j]=m[j+1];
                    m[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}