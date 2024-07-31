package mathProblems;

public class PalindromeNumber 
{
	
	    public boolean isPalindrome(int x) 
	    {
	        if(x<0)
	        {
	            return false;
	        }
	        else
	        {
	            String s=Integer.toString(x);
	            StringBuilder sb=new StringBuilder(s);
	            sb.reverse();
	            String s1=sb.toString();
	            if(s1.equals(s))
	            {
	                return true;
	            }
	            else
	            {
	                return false;
	            }

	        }    
	    }
	
}
