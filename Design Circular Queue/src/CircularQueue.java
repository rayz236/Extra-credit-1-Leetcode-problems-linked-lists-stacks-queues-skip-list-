class MyCircularQueue {
    private int maxSize;
    private int[] data;
    private int head;
    private int currSize;

    public MyCircularQueue(int k) {
        maxSize = k;
        data = new int[maxSize];
        head = 0;
        currSize = 0;
    }

    public boolean enQueue(int value) {
        if (currSize < maxSize) {
            data[(head + currSize) % data.length] = value;
            currSize++;
            return true;
        } else return false;
    }

    public boolean deQueue() {
        if (currSize > 0) {
            head = (head + 1) % data.length;
            currSize--;
            return true;
        } else return false;
    }

    public int Front() {
        if (currSize == 0) return -1;
        else return (data[head]);
    }

    public int Rear() {
        if (currSize == 0) return -1;
        else return (data[(head + currSize - 1) % data.length]);
    }

    public boolean isEmpty() {
        return (currSize == 0);
    }

    public boolean isFull() {
        return (currSize == maxSize);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
//test submit1