package hashing_problems;

public class FrequenciesOfLimitedRangeArrayElements 
{
	public static void frequencyCount(int arr[], int N, int P)
    {
        int [] hash_arr=new int[N+1];
        for(int i=0;i<N;i++)
        {
            if(arr[i]<=P && arr[i]<=N)
            {
                hash_arr[arr[i]]+=1;
            }
        }
        
        for(int i=0;i<N;i++)
        {
            arr[i]=0;
        }
        
        for(int i=0;i<N;i++)
        {
            arr[i]=hash_arr[i+1];
        }
        
    }
}
