class Solution {
    public int countPartitions(int[] nums) {
        int t = 0;
        for (int i = 0;i < nums.length; i++){
            t += nums[i];
        }
        int c = 0;
        int ls = 0;
        for (int i = 0; i < nums.length -1 ; i++){
            ls += nums[i];
            int rs = t - ls;
            if ((ls % 2 == 0) == (rs % 2 == 0)){
                c++;
            }
        }
        return c;
    }
}