class good {

    public int max(int[] nums){
        int max = nums[0];
        int size = nums.length;
        for (int i=0;i<size;i++){
            if(nums[i]>max)
            max = nums[i];
        } 
        return max;
    }

    public void twoSum(int[] nums, int target) {
        int size = nums.length;

        // using max function to find length of hash array
        int max = max(nums);
        int[] hash = new int[max];

        // initializing hash array with all 0
        for(int i=0;i<max;i++){
            hash[i]=0;
        }

        for(int i=0; i<size;i++){
            hash[nums[i]]++;
        }
    }
}