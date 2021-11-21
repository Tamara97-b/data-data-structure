package hashtable;

public class HashTable<T> {
    Entry[] arrayOfHashTable ;
    int size;

    public HashTable(int size) {
        this.size = size;
        arrayOfHashTable = new Entry[this.size];
        for (int i = 0 ;i<arrayOfHashTable.length;i++)
            arrayOfHashTable[i]=new Entry<T>();
    }

    public int hash(int key){
        return key%size;

    }

    public void add(int key , T value){
        int index = hash(key);
        Entry arrayValue = arrayOfHashTable[index];
        Entry newItem = new Entry<T>(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;
    }

    public T get(int key){
        T value=null;
        int index = hash(key);
        Entry arrayValue = arrayOfHashTable[index];
        while (arrayValue!=null){
            if(arrayValue.getKey()==key){
                value=(T)arrayValue.getValue();
                break;
            }
            arrayValue=arrayValue.next;
        }

        return value;
    }
    public boolean contain(int key){
        T value=null;
        boolean x = false;
        int index = hash(key);
        Entry arrayValue = arrayOfHashTable[index];
        while (arrayValue!=null){
            if(arrayValue.getKey()==key){
                value=(T)arrayValue.getValue();
                x= true;
                break;
            }
            arrayValue=arrayValue.next;
        }

        return x;
    }

    }



