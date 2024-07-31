package mathProblems;


class CountDigits
{
  static int evenlyDivides(int N)
  {
     int count=0;
     int n=N;
     while(n>0)
     {
         int r=n%10;
         if( r!=0 && N%r==0)
         {
             count++;
         }
         n=n/10;
     }
     return count;
  }
}