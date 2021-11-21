# HashTable

is a data structure that implements an associative array abstract data type, a structure that can map keys to values. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.

### challenge:
Implement a Hashtable Class with the following methods:
add
Arguments: key, value
Returns: nothing
This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
get
Arguments: key
Returns: Value associated with that key in the table
contains
Arguments: key
Returns: Boolean, indicating if the key exists in the table already.
hash
Arguments: key
Returns: Index in the collection for that key

## Approach & Efficiency
Big O for :
add :
Big O space/time O (n)
get
Big O space/time O (n)
contains
Big O space/time O (n)
hash
Big O space/time O (n)
### API
add(T key, T value) :adds the key/value pairs to the table.

get(T key) : return the value from the table based on inserted key.

contains(T key) :takes key as an Arguments and Returns Boolean, indicating if the key exists in the table already.

hash :takes key as an Arguments key and Returns Index in the collection for that key.

## code challenge 31

### description 
Writing a function called repeated word that finds the first word to occur more than once in a string.

### whiteboard

![image](img/cc31.PNG)

### approch and effeciancy

Time : Big O(n)

Space : Big O(n)