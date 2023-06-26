public class Shiftzero {
    public static void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[r]!= 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
            r++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
