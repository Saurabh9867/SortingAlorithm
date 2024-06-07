package SortingAlgorithm;

import java.util.Arrays;

public class selectionSort {

    private static int maxIndex;
    private static int temp;

    public static int[] selectionSortImpl(int arr[]){

        if(arr == null) {
            System.out.println("Input Array can not be Null");
            throw new NullPointerException();
        }

        int size = arr.length;
        for(int i = 0; i < size - 1; i++){
            maxIndex = 0;
            for(int j = 0; j < size - i; j++){
                if(arr[maxIndex] < arr[j])
                    maxIndex = j;
            }
            swap(arr,size-i-1,maxIndex);
        }

        return arr;
    }

    private static void swap(int arr[], int lastIndex, int maxIndex){
        temp = arr[lastIndex];
        arr[lastIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
