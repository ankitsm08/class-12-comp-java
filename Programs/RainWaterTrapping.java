package Programs;

public class RainWaterTrapping {
  public static int trap(int[] height) {
    int n = height.length;
    if (n == 0)
      return 0;

    int[] leftMax = new int[n];
    int[] rightMax = new int[n];
    int waterTrapped = 0;

    // Fill leftMax array
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }

    // Fill rightMax array
    rightMax[n - 1] = height[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    }

    // Calculate trapped water
    for (int i = 0; i < n; i++) {
      waterTrapped += Math.min(leftMax[i], rightMax[i]) - height[i];
    }

    return waterTrapped;
  }

  public static void main(String[] args) {
    int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    System.out.println("Trapped water: " + trap(height));
  }
}
