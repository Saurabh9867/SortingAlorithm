package SortingAlgorithm;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {46, 99, 23, 12, 15};

        try {
            System.out.println("Sorted Array : " + Arrays.toString(bubbleSortImpl(arr)));
        }
        catch (NullPointerException e){
            System.out.println("Input Array can not be Null");
        }
    }

    private static int[] bubbleSortImpl(int[] arr){

        if(arr == null){
            throw new NullPointerException();
        }

        int temp;
        int size = arr.length;

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
