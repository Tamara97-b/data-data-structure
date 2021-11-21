package hashtable;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class HashTable<T> {
    Entry[] arrayOfHashTable ;
    int size;

    public HashTable(int size) {
        this.size = size;
        arrayOfHashTable = new Entry[this.size];
        for (int i = 0 ;i<arrayOfHashTable.length;i++)
            arrayOfHashTable[i]=new Entry<T>();
    }


    public int hash(String key) {
        String keyToUse = key.toLowerCase();
        int ascii = 0, index;
        for (int i = 0; i < keyToUse.length(); i++) {
            ascii += keyToUse.charAt(i);
            System.out.println("ASCII Code of " + keyToUse.charAt(i) + " = " + ascii);
        }

        index = ascii % arrayOfHashTable.length;
        System.out.println("index : " + index);
        return index;
    }



    public void add(String key , T value){
        int index = hash(key);
        Entry arrayValue = arrayOfHashTable[index];
        Entry newItem = new Entry<T>(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;
    }

    public T get(String key){
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
    public boolean contain(String key){
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

    public String repeatedWord(String text) throws Exception{
        if (text == null){
            throw new Exception("Empty Text!!");
        }
        String[] words = text.split(" ");
        String word= "";
        Map<String,String> wordMap = new HashMap<>();

        for (String s : words) {
            word = s.toLowerCase();
            if (wordMap.get(word) != null) {
                System.out.println("The First Repeated Word Is : " + word);
                break;
            } else {
                wordMap.put(word, word);
            }
        }
        return word;
    }

    }



