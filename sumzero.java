// { Driver Code Starts
import java.util.*;
class sumzero {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
        scan.close();
	}
	
	
}// } Driver Code Ends


class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    boolean findsum(int arr[],int n)
    {
        //Your code here
        
        for(int i=0; i< n ; i++){
            int sum = arr[i];
            if(sum==0){
                return true;
            }
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    return true;
                }
                
            }
            
        }
        return false;
    }
}

