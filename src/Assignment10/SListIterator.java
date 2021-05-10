package Assignment10;

public class SListIterator<T> {
    public SList<T> list;

    public SListIterator(SList<T> list) {
        this.list=list;
    }

    public void addNode(T data)
    {
        Node<T> newNode=new Node<>(data);
        Node<T> currNode = list.head;
        if(currNode == null)
            list.head =newNode ;
        else {
            while (currNode.next != null)
                currNode = currNode.next;
            currNode.next = newNode;
        }
        list.size++;
    }

    public void removeNode(int index) {
        Node<T> prevNode= list.head;
        if(index>=list.size || index<0) {
            System.out.println("Invalid index");
        }
        else{
            if(index==0) {
                if (list.size == 1)
                    list.head = null;
                else
                    list.head = list.head.next;
            }
            else{
                int prevIndex=0;
                while (prevIndex<index-1){
                    prevNode=prevNode.next;
                    prevIndex+=1;
                }
                prevNode.next=prevNode.next.next;
            }
            list.size--;
        }
    }
}
