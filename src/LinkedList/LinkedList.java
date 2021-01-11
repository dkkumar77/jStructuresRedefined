package LinkedList;

public class LinkedList<E> implements LinkedListInterface<E> {
    private Node<E> head;
    private Node<E> tail;
    private int count;



    LinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    LinkedList(E value){
        head = new Node<E>(value);
        count++;
        tail = head;

    }
    @Override
    public E add(E value) {

        if(head != null){
            tail.setNext(new Node<E>(value));
            tail = tail.getNext();
            count++;
            }
        else{
            head = new Node<E>(value);
            count++;
            tail = head;
        }
        return null;
    }

    @Override
    public E remove(E value) {
        return null;
    }

    @Override
    public Node<E> get(E value) {
        Node<E> tempHead = head;
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == null ;
    }

    @Override
    public E[] toArray() {
        Node<E> tempHead = head;
        E[] array = (E[]) new Object[count];
        int i = 0;

        while(tempHead != null){
            array[i++] = tempHead.getData();
            tempHead = tempHead.next;
        }
        return array;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        E[] array = this.toArray();
        for(E element : array){
            string.append(element + " ");
        }

        return "[ " +  string.toString() + "]" ;
    }

    public Node<E> peekFirst() {

        return (head == null ) ? null : head;
    }

    public Node<E> peekLast() {
        return (tail == null) ? null : tail;
    }

    @Override
    public boolean contains(E value) {
        Node<E> _head = head;

        while(_head != null){
            if(_head.getData().equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public LinkedList<E> clone() {
        LinkedList<E> newlyAllocated = new LinkedList<E>();
        Node<E> _head = head;

        while(_head != null){

            newlyAllocated.add(_head.getData());
            _head = _head.next;
        }

        return newlyAllocated;
    }

    /**
     * Clear method sets the head equal to zero and let's the garbage clean
     * unused memory.
     */
    @Override
    public void clear() {
        this.head = null;
        this.count = 0;

    }

    @Override
    public E removeFirst() {
        if(!isEmpty()) {
            if (head.next != null) {
                head = head.next;
                return head.getData();

            } else {
                head = null;
                return null;


            }
        }
        else{
            return null;


        }

    }

    @Override
    public E removeTail() {
        Node<E> _tail;

        if(head.equals(tail)){
            _tail = head;
            head = null;
        }
        else{
            _tail = tail;
            tail.getPrevious().setNext(null);
        }
        return _tail.getData();

    }

    @Override
    public boolean firstOccurence() {
        return false;
    }

    @Override
    public int size() {
        return count;
    }



    public E addFirst(E value) {
        if(head == null){
            add(value);

        }
        else{
            Node<E> originalHead = head;
            head.setPrevious(new Node<E>(value));
            head.getPrevious().setNext(originalHead);
            head = head.getPrevious();
            System.out.println();
            count++;

        }

        return value;
    }

    public static void main(String[] args) {
        LinkedList e = new LinkedList();


        for(int i = 0; i<10; i++){
            e.add(i);
            System.out.println(e + "\n");
        }
        e.addFirst(-1);
        System.out.println(e);

    }
}
