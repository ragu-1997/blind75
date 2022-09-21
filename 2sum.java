class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> l1 = new ArrayList<>();

            for(int i=0;i<nums.length;i++)
            {
                    for(int j = i+1;j<nums.length;j++)
                    {
                            int value = nums[i]+nums[j];
                            if(target==value)
                            {
                                    return new int[]{i,j};
                            }
                    }
            }
            return new int[]{0,0};
    }
}
