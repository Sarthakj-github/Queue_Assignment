class MyCircularQueue {
    int[] Q;
    int k,front=-1,rear=-1;
    public MyCircularQueue(int k) {
        Q = new int[k];
        this.k=k;
    }
    public boolean enQueue(int value) {
        if(isFull())   return false;
        if(front==-1)   front=0;
        rear=(rear+1)%k;
        Q[rear]=value;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty())   return false;
        int t=Q[front];
        if(front==rear){
            front=-1;   rear=-1;
        }
        else    front=(front+1)%k;
        return true;
    }
    public int Front() {
        if(front==-1) return -1;
        return Q[front];
    }
    public int Rear() {
        if(rear==-1) return -1;
        return Q[rear];
    }
    public boolean isEmpty() {
        if(front==-1)   return true;
        return false;
    }
    public boolean isFull() {
        if((rear+1)%k == front)    return true;
        return false;
    }
}
