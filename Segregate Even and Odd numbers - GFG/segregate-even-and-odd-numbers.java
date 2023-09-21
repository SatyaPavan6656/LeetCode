//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().segregateEvenOdd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java




class Solution {
    void segregateEvenOdd(int arr[], int n) {
        // code here
       Arrays.sort(arr);
       int []temp=new int[n];
       int k=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]%2==0)
           {
               temp[k]=arr[i];
               k++;
           }
       }
       for(int i=0;i<n;i++)
       {
           if(arr[i]%2!=0)
           {
               temp[k]=arr[i];
               k++;
           }
       }
       for(int i=0;i<temp.length;i++)
       {
           arr[i]=temp[i];
       }
    }
}