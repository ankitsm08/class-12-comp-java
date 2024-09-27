1. Initialize:
   - Set n as the length of the array.
   - Create two arrays leftMax and rightMax of size n.
   - Create a variable waterTrapped and initialize it to 0.

2. Calculate Left Maximums:
   - Set leftMax[0] to height[0].
   - Iterate from the second element to the end of the array:
     - leftMax[i] = max(leftMax[i-1], height[i]).

3. Calculate Right Maximums:
   - Set rightMax[n-1] to height[n-1].
   - Iterate from the second-to-last element to the beginning of the array:
     - rightMax[i] = max(rightMax[i+1], height[i]).

4. Calculate Trapped Water:
   - Iterate through the height array:
     - At each index i, calculate the trapped water as min(leftMax[i], rightMax[i]) - height[i].
     - Add this value to waterTrapped.

5. Return the Result:
   - Output waterTrapped.
