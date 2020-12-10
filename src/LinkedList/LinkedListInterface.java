package LinkedList;

public interface LinkedListInterface<T> {

    public T add(T value);

    public T remove(T value);

    public Node<T> get(T value);

    public boolean isEmpty();

    public T[] toArray();


    public boolean contains(T value);

    public LinkedList<T> clone();

    public void clear();

    public T removeFirst();

    public T removeTail();

    public boolean firstOccurence();

    public int size();

    public T addFirst(T value);








}
