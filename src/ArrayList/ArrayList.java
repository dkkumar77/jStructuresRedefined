package ArrayList;

/**
 * Deepak's Generic Arraylist: DESCRIPTION TBD
 * @param <T>
 */
public class ArrayList<T> implements DynamicArrayInterface{
    private int startSize;
    private final int GEN_SIZE = 5;
    private int MAX_SIZE;
    private int currentSize;


    private int size;
    private T mainStorage[];

    /**
     * Generic Arraylist Constructor initializes an array to @GEN_SIZE which is the default value of five.
     */
    ArrayList(){
       mainStorage = (T[]) new Object [GEN_SIZE];
       this.startSize = GEN_SIZE;
       this.MAX_SIZE = GEN_SIZE;
    }


    /**
     *
     * @param size
     */
    @SuppressWarnings("unchecked")
    ArrayList(int size){
        this.startSize = size;
        this.MAX_SIZE = size;
        mainStorage = (T[]) new Object[startSize];

    }

    /**
     *
     * @param value
     */
    @Override
    protected void add(T value){
        if(this.currentSize+1 < MAX_SIZE){
            mainStorage[currentSize] = value;
            currentSize++;
            
        }
        else{
            deepCopy();
            add(value);
        }
    }

    /**
     *
     */
    protected void deepCopy(){
        T[] tempCopy = (T[]) new Object[this.MAX_SIZE*2];
        System.arraycopy(mainStorage,0,tempCopy,0, currentSize);
        MAX_SIZE= tempCopy.length;
        mainStorage = tempCopy;


    }

    /**
     *
     */
    public void reset(){
        T[] tempCopy = (T[]) new Object[this.startSize];

        mainStorage = tempCopy;

    }

    /**
     *
     * @param val
     * @return
     */
    public boolean search(T val){

        return !linearSearch(val) ? false : true;

    }

    /**
     *
     * @param val
     * @return
     */
    private boolean linearSearch(T val){
        for(T inc: mainStorage){
            if(inc.equals(val)){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param index
     * @return
     */
    public T remove(int index){
        T returnValue = mainStorage[index];
        for(int i =  index+1; i< currentSize ; i++){
                mainStorage[i - 1] = mainStorage[i];

        }
        mainStorage[currentSize--] = null;
        return returnValue;
    }

    /**
     *
     * @return
     */
    public String toString(){
        StringBuilder string = new StringBuilder();
        int count = 0;
        for(T value : mainStorage){
          if(count == currentSize){
              break;
          }
            string.append(value + " ");
            count++;
        }

        return "[ " + string.toString() + "]";

    }

    /**
     *
     * @param value
     * @return
     */
    protected T removeValue(T value){
        int indexed = 0;
        if(!search(value)){
            return null;
        }
        else{
            for(int i = 0; i < currentSize; i++){
                if(mainStorage[i].equals(value)){
                    indexed = i;
                    break;
                }
            }
            remove(indexed);

        }
        return value;

    }


    public T set(int index, T value){
        try {
            if(index>0) {
                mainStorage[index] = value;
            }
            else{
                throw new IndexOutOfBoundsException();
            }
        }
        catch (IndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        return mainStorage[index];

    }



    public int size(){
        return currentSize;

    }

    public T[] toArray(){
        return mainStorage;
    }




    protected void clear(){
        int i;
        final int loop = this.currentSize;
        for(i = 0; i < loop; i++){
            this.mainStorage[i] = null;
        }
        T[] n = (T[]) new Object[startSize];

         mainStorage = n;



    }


    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList();

        for(int i = 0; i<10;i++){
            test.add(i);

        }
        test.remove(2);

        System.out.println(test);
        test.removeValue(4);

        System.out.println(test);



    }

}
