package Humble;

public class Array01_maxEnd3 {
    // max()를 사용해서 요소의 크기 비교
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }
}
