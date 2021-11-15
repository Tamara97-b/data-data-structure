/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package isertionSort;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        int[]arr={8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    public static int[] insertionSort(int[]arr){
        if(arr.length<=1){
            return arr;
        }
        for(int i = 1 ; i< arr.length; i++){
            int temp = arr[i];
            int j;
            for ( j = i-1; j>=0 && temp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

        return arr;

    }


}
