package hashtable;

public class Entry<T> {
    String key;
    T value;
    Entry next;

    public Entry(String  key, T value) {
        this.key = key;
        this.value = value;
       next = null;
    }
    public Entry(){
        next=null;
    }
    public String getKey(){
        return key;
    }

    public T getValue(){
        return  value;
    }

}
