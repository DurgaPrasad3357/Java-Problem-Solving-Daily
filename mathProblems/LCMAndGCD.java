package mathProblems;

public class LCMAndGCD 
{



    static Long[] lcmAndGcd(Long A , Long B) 
    {
        long gcd=1;
        long lcm=0;
        long s=0;
        long l=0;
            if(A<B)
            {
                s=A;
                l=B;
            }
            else
            {
                l=A;
                s=B;
            }
            while(true)
           {
                    long r=l%s;
                    
                    if(r==0)
                    {
                        gcd=s;
                        break;
                    }
                    l=s;
                    s=r;
            }   
            lcm=(A*B)/gcd;
            return new Long[]{lcm,gcd};
            
    }

}
