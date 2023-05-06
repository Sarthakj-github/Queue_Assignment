class MyQueue {
    int[] arr = new int[100];
    int f=0;
    int r=0;
    public MyQueue() {
    }
    
    public void push(int x) {
        if(full()) return ;
        this.arr[this.r]=x;
        this.r+=1;
    }
    
    public int pop() {
        if(empty()) return 0;
        int x=this.arr[this.f];
        this.f+=1;
        return x;
    }
    
    public int peek() {
        return this.arr[this.f];
    }
    
    public boolean empty() {
        if(this.f==this.r){
            this.f=0;
            this.r=0;
            return true;
        }
        return false;
    }
    public boolean full(){
        if(this.r==100)  return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
