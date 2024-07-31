package mathProblems;

import java.util.ArrayList;

public class Sumofalldivisorsfrom1ton 
{
	
	    static long sumOfDivisors(int N)
	    {
	       long sum=0;
	       for(int i=1;i<=N;i++)
	       {
	           int s=returnSumOfDivisors(i);
	           sum=sum+s;
	       }
	       return sum;
	       
	    }
	    public static int returnSumOfDivisors(int a)
	    {
	        ArrayList<Integer> al=new ArrayList<>();
	        int sum=0;
	        for(int i=1;i<=Math.sqrt(a);i++)
	        {
	            if(a%i==0)
	            {
	                al.add(i);
	                if(i!=(a/i))
	               {
	                al.add((a/i));
	               }
	            }
	            
	        }
	        for(int j:al)
	        {
	            sum=sum+j;
	        }
	        return sum;
	    }
	
}
