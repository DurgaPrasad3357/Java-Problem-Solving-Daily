package mathProblems;

public class ReverseInteger 
{
	
	    public int reverse(int x) 
	    {
	        try
	        {
	       int flag=0;
	       if(x<0)
	       {
	            x=x*-1;
	            flag=1;
	       }
	       String s=Integer.toString(x);
	       StringBuilder sb=new StringBuilder(s);
	       sb.reverse();
	        s=sb.toString();
	        int rev=Integer.parseInt(s);
	        if(flag==1)
	        {
	            return -1*rev;
	        }
	        return rev;
	        }
	        catch(NumberFormatException e)
	        {
	            return 0;
	        }
	    }
	}

