class Solution(object):
    def countPartitions(self, nums):
        t = 0
        for i in range(len(nums)):
            t += nums[i]
        l = 0
        c = 0
        for i in range(len(nums) - 1):
            l += nums[i]
            r = t - l
            if (l % 2 == 0) == (r % 2 == 0):
                c += 1
        return c
            
        