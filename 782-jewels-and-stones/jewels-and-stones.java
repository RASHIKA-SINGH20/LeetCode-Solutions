class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] arr1 = jewels.toCharArray();
        char[] arr2 = stones.toCharArray();
        int count = 0;

        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr2.length ; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}