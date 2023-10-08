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

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
         if(n==2){
            if(arr[0] > arr[1])return arr[0];
            else return arr[1];
        }
        if(arr[n-1] > arr[n-2])return arr[n-1];
       
        int l = 0; int r = n-1;
        while(l <= r){
            int mid = l + (r - l)/2;   // => 2l + h - l => l + h
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])return arr[mid];
            else if(arr[mid] > arr[mid-1])l = mid+1;
            else if(arr[mid] > arr[mid+1]) r = mid - 1;
            else l=l+1;
        }
        return -1;
    }
    
}