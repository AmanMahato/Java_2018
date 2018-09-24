//Largest Rectangle in Histogram

public class HistogramLargestRectangle{

public int largestRectangleArea(int[] heights) {
    if(heights.length == 0 || heights == null) return 0;
    Stack<Integer> stack = new Stack<>();
    int localMaxArea = 0;
    int globalMaxArea = 0;
    int i;
    for(i=0;i<heights.length;){
        if(stack.isEmpty() || heights[stack.peek()]<=heights[i]){
            stack.push(i++);
        } else {
            Integer popped = stack.pop();
            if(stack.isEmpty()){
                localMaxArea = heights[popped] * i;
            } else {
                localMaxArea = heights[popped] * (i-stack.peek()-1);
            }
        }
        globalMaxArea = Math.max(globalMaxArea,localMaxArea);
    }
    while(!stack.isEmpty()){
        Integer popped = stack.pop();
            if(stack.isEmpty()){
                localMaxArea = heights[popped] * i;
            } else {
                localMaxArea = heights[popped] * (i-stack.peek()-1);
            }
        globalMaxArea = Math.max(globalMaxArea,localMaxArea);
    }
    return globalMaxArea;
}

}
