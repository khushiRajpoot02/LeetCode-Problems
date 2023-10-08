//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char ch[] = str.toCharArray();
        // for(int i = 0; i < str.length() ; i++){
        //      System.out.print(ch[i] + " ");
        // }
        int l =0;
        int r = str.length()-1;
        while(l<=r){
            char ch1 = ch[l];
            ch[l] = ch[r];
            ch[r] = ch1;
            l++;
            r--;
        }
       return String.valueOf(ch);
    }
}