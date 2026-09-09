class Solution {
    public int calPoints(String[] operations) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if ( operations[i].equals("D")){
                int d = stack.peek() *2;
                stack.push(d);
            }else if(operations[i].equals("C")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        for(int sum : stack){
            result += sum;
        }

        return result;
    }
}