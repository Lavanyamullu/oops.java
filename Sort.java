import java.util.*;
public class Sort
{
    public static void main(String a[])
    {  
        int[] arr1={64, 25, 12, 22, 11};  
        System.out.println("Before Selection Sort : "+Arrays.toString(arr1));
        for(int i=0;i<arr1.length-1;i++)
        {  
            int index=i;  
            for (int j=i+1;j<arr1.length;j++)
            {  
                if(arr1[j]<arr1[index])
                {  
                    index=j; 
                }  
            }  
            int smallerNumber=arr1[index];   
            arr1[index]=arr1[i];  
            arr1[i]=smallerNumber;  
        }
        System.out.println("After Selection Sort");  
        System.out.println(Arrays.toString(arr1));
        
    }
}