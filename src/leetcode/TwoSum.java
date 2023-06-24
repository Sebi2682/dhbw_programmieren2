package leetcode;

public class TwoSum {

  public static void main(String[] args) {

    System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    System.out.println(twoSum(new int[]{3, 2, 4}, 6));
    System.out.println(twoSum(new int[]{3, 3}, 6));
  }

  public static int[] twoSum(int[] nums, int target) {
    int[] out = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int e = 0; e < nums.length; e++) {
        if (nums[i] + nums[e] == target && i != e) {
          out[0] = i;
          out[1] = e;
          return out;
        }
      }
    }
    return null;
  }

}
