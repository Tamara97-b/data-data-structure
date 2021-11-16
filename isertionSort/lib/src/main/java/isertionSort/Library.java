/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package isertionSort;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        int[]arr={8,4,23,42,16,15};
        System.out.println(Arrays.toString(insertionSort(arr)));
        System.out.println("------------------------------------------------------");
        System.out.println(Arrays.toString(quickSort(arr,0,5)));

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
    public static int[] quickSort(int[] array, int left, int right) {
        if(left < right) {
            int position  = partition(array, left, right);
            quickSort(array, left, position  - 1);
            quickSort(array, position  + 1, right);
        }
        return array;
    }

    public static int partition(int[] array, int left, int right) {
        int pivot  = array[right];
        int low = left - 1;
        for(int i = left; i < right; i++) {
            if(array[i] - pivot < 0) {
                low++;
                swap(array, i, low);
            }
        }

        swap(array, right, low + 1);
        return low + 1;
    }

    public static void swap(int[] array, int i, int low) {
        int temp = array[i];
        array[i] = array[low];
        array[low] = temp;
    }


}
