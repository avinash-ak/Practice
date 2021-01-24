

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int findElement(int arr[],int n){
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int[] suffix=new int[n];
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+arr[i];
        }
        for(int i=1;i<n-1;i++){
            if(prefix[i]==suffix[i]){
                return arr[i];
            }
        }
        return -1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int arr[]={1,4,2,5};
	    int n=arr.length;
	    System.out.println(findElement(arr,n));
	    /*
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;++i){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;++i){
		    System.out.print(arr[i]+" ");
		}*/
	}
}
-----------------------Space efficient Solution-----------------------------------
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/*
*/

class Codechef
{
    static int findElement(int arr[],int n){
        
        int rightSum=0,leftSum=0;
        
        for(int i=1;i<n;++i){
            rightSum+=arr[i];
        }
        
        for(int i=0,j=1;j<n;i++,j++){
            rightSum-=arr[j];
            leftSum+=arr[i];
            
            if(leftSum==rightSum){
                return arr[i+1];
            }
        }
        return -1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int arr[]={1,1,0,2};
	    int n=arr.length;
	    System.out.println(findElement(arr,n));
	   
	}
}

