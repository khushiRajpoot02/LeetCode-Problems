class MyStack {
Queue<Integer> que1;
Queue<Integer> que2;
    public MyStack() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }
    public void push(int x) { 
        //  que1.add(x);//1//2
     while(que1.size() > 0){
            que2.add(que1.remove());//1//2
        }
        que1.add(x);//2
         while(!que2.isEmpty()){
             que1.add(que2.remove());//1//2
         }
    }
    public int pop() {
        return que1.remove();
        
    }
    public int top() {
        return que1.peek();
        
    }
    public boolean empty() {
        return que1.isEmpty();
        
    }
}
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */