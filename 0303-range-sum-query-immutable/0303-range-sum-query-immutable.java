class NumArray {

    private int[] arr;
    private int[] ps;

    public NumArray(int[] nums) {
        arr = nums.clone();
        ps = new int[nums.length];
        ps[0] = arr[0];

        for(int i = 1; i < nums.length; i++){
            ps[i] = arr[i] + ps[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return ps[right];
        return ps[right] - ps[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */