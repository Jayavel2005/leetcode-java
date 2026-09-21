class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> nums = new ArrayDeque<>();
        for(String ch : tokens){
            if(ch.equals("+")){
                nums.push(nums.pop() + nums.pop());
            }
            else if(ch.equals("-")){
                nums.push((nums.pop() - nums.pop()) * -1);
            }
            else if(ch.equals("*")){
                nums.push(nums.pop() * nums.pop());
            }
            else if(ch.equals("/")){
                int first = nums.pop();
                nums.push(nums.pop() / first);
            }
            else{
                nums.push(Integer.parseInt(ch));
            }
        }
        return nums.pop();
    }
}