public class FreqStack {

    Map<Integer,Integer> freq;
    Map<Integer, Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int x) {
        if(!freq.containsKey(x)){
            freq.put(x,1);
        } else {
            freq.put(x,freq.get(x)+1);
        }
        int currentElemFreq = freq.get(x);
        maxFreq= Math.max(currentElemFreq,maxFreq);
        if(!group.containsKey(currentElemFreq)){
            group.put(currentElemFreq,new Stack<Integer>());
        }
        Stack<Integer> existingStack = group.get(currentElemFreq);
        existingStack.push(x);
        group.put(currentElemFreq,existingStack);
    }

    public int pop() {
        int result = group.get(maxFreq).pop();
        freq.put(result,freq.get(result)-1);
        if(group.get(result).size()==0) maxFreq--;
        return result;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
