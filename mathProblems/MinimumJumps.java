package mathProblems;

public class MinimumJumps 
{
	
	    static int minJumps(int[] arr, int n) 
	    {
	        
	        if (n <= 1) 
	        {
	            return 0;
	        }

	        if (arr[0] == 0) 
	        {
	            return -1;
	        }

	        int jumps = 0;
	        int current_end = 0; 
	        int farthest = 0; 

	        for (int i = 0; i < n - 1; i++) 
	        {
	            farthest = Math.max(farthest, i + arr[i]);

	            if (i == current_end) 
	            {
	                jumps++; 
	                current_end = farthest; 

	                if (current_end >= n - 1) 
	                {
	                    return jumps;
	                }
	            }
	        }

	        return -1;
	    }
	

}
