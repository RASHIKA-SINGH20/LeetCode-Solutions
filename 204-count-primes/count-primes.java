class Solution {
    public int countPrimes(int n) {
        if(n <= 2)
        {
            return 0;
        }
        boolean[] prime = new boolean[n];

        for(int i = 2 ; i < n ; i++)// sare number ko prime man lenge
        {
            prime[i] = true;
        } 
        for(int i = 2 ; i*i < n ; i++)
        {
            if(prime[i])
            {
                for(int j = i*i ; j < n ; j+=i) //Starting from i², visit every multiple of i and mark it as not prime.
                {
                        prime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2 ; i < n ; i++)// ab prime count kr lenge
        {
            if(prime[i])
            {
                count++;
            }
        }
        return count;
    }
}