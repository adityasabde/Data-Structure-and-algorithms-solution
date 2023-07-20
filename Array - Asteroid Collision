import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Deque<Integer> stk = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (stk.isEmpty() || asteroids[i] > 0) {
                stk.push(asteroids[i]);
            } else {
                while (!stk.isEmpty() && stk.peek() > 0 && stk.peek() < Math.abs(asteroids[i])) {
                    stk.pop();
                }

                if (!stk.isEmpty() && stk.peek() == Math.abs(asteroids[i])) {
                    stk.pop();
                } else {
                    if (stk.isEmpty() || stk.peek() < 0) {
                        stk.push(asteroids[i]);
                    }
                } 
            }
        }
        
        int[] ans = new int[stk.size()];
        int size = stk.size();
        while (!stk.isEmpty()) {
            ans[--size] = stk.pop();
        }
        
        return ans;
    }
}
