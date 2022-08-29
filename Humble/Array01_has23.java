package Humble;

public class Array01_has23 {
    // 배열에 요소 2 또는 3이 포함되어있는지 확인
    public boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return true;
            }
        }
        return false;
    }
}
