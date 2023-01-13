public class MyQueueNode {
    private int data;
    private MyQueueNode next;

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public MyQueueNode getNext(){
        return next;
    }

    public void setNext (MyQueueNode next){
        this.next = next;
    }
}
