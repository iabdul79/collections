package collections;

public class ArraySolution {
  public int findMiddleIndex(int[] nums) {
    int sumLeft = 0;
    int sumRight = 0;
    int i = nums.length - 1;
    while (i >= 0) {
      sumRight += nums[i];
      i--;
    }
    int j = 0;
    while (j < nums.length) {
      sumRight -= nums[j];
      if (sumLeft == sumRight) {
        return j;
      }
      sumLeft += nums[j];
      j++;
    }
    return -1;
  }
}
