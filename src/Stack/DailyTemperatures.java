package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
            int[] res = new int[temperatures.length];
            Stack<Integer> stack = new Stack<>();
            for (int i=0; i<temperatures.length; i++){
                while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                    int idx = stack.pop();
                    res[idx] = i-idx;
                }
                stack.push(i);
            }
            return res;
    }
}
