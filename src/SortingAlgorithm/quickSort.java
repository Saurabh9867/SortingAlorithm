package SortingAlgorithm;

public class quickSort {

    public static void quickSortImpl(int[] arr, int low, int high){
        if(low < high){
            int pivot = getPivot(arr, low, high);

            quickSortImpl(arr, low, pivot - 1);
            quickSortImpl(arr, pivot + 1, high);
        }
    }

    public static int getPivot(int[] arr, int low, int high){
        return -1;
    }
}
