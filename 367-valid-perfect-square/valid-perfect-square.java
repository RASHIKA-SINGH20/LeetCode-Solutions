class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
        {
            return true;
        }
        for(int i = 2 ; i < num ; i++)
        {
            if((long)i*i == num)
            {
                return true;
            }
        }
        return false;
    }
}