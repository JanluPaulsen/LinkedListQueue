public class MyQueue {
    private MyQueueNode front;
    private MyQueueNode rear;

    public MyQueue(){
        front = null;
        rear = null;
    }

    public boolean isEmpty(){
        return (front == null && rear == null);
    }

    public void enqueue(int value){
        MyQueueNode temp = new MyQueueNode();
        temp.setData(value);
        temp.setNext(null);
        if (isEmpty()){
            front = temp;
        }else {
            rear.setNext(temp);
        }
        rear = temp;
    }

    public int dequeue(){
        int returnValue = front.getData();
        if (front == rear) {
            rear = rear.getNext();
        }
        front = front.getNext();
        return returnValue;
    }

    public void display(){
        MyQueueNode p = front;
        while (p != null){
            System.out.println(p.getData() + " ");
            p = p.getNext();
        }
    }
}
