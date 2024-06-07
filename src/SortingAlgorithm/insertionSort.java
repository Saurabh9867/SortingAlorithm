package SortingAlgorithm;

public class insertionSort {

    private static int temp;
    private static int key;

    public static int[] insertionSortImpl(int[] arr){

        if(arr == null){
            System.out.println("Input Array can not be Null");
            throw new NullPointerException();
        }

        int size = arr.length;

        for(int i = 1; i < size; i++){
            key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
