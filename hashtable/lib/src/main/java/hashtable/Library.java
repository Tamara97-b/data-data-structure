/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class Library {
    public static void main(String[] args) throws Exception {
        System.out.println("hellooooooooo");
         HashTable<String> hashTable=new HashTable<String>(5);
         hashTable.add(4,"tamara");
         hashTable.add(1,"lara");
         hashTable.add(3,"jood");
        System.out.println(hashTable.get(3));
        System.out.println(hashTable.contain(7));

    }
}
