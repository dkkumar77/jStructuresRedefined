package LinkedList;

public class Node<T> {

    T data;
    Node<T> next;
    Node<T>  previous;

    public Node(T data){
        setData(data);
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public Node<T> getNext(){
       return this.next;
    }

    public Node<T> getPrevious(){
        return this.previous;
    }
    public void setPrevious(Node<T> previous){
        this.previous = previous;

    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }





}
