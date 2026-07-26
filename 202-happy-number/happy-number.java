class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1)
        {
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
            int sq = 0;

            while(n > 0)
            {
                int digit = n % 10;
                sq += digit*digit;
                n/=10;
            }

            n = sq;
        }

        return true;
    }
}