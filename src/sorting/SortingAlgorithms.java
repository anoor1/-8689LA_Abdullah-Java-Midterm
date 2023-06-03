package sorting;

import java.util.Arrays;

public class SortingAlgorithms {


    /** INSTRUCTIONS
     * You must implement all of the sorting algorithms below. Feel free to add any helper methods that you may need,
     * but make sure they are private, as to not be accessed outside of this class.
     *
     * You must also store the sorted arrays into their own individual database tables (Selection Sort should be stored
     *  in table `selection_sort`, Insertion Sort should be stored in table `insertion_sort`)
     */

    long executionTime = 0;

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

     int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }

            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;

        return array;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE
        int[] result = Arrays.copyOf(array, array.length);
        int n = result.length;
        int i = 1;
        int j = i;
        for (i = 1; i < n; i++) {
            j = i;

            while ((j > 0) && (result[j] < result[j - 1])) {

                result[j] = result[j -1];
                j--;
            }
        }

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return result;
    }

    public int[] bubbleSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE
        int[] result = Arrays.copyOf(array, array.length);
        int a = result.length;
        for( int i =0; i < a-1; i++){
            for ( int j = 0; j< a-1-i; j++){
                if(result[j] > result[j+1]){
                    int temp = result[j];
                    result[j] = result[j+1];
                            result[j+1] = temp;

                }
            }
        }
        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return result;
    }

    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public int[] mergeSort(int[] array) {
        // IMPLEMENT HERE
        final long startTime = System.currentTimeMillis();
        // IMPLEMENT HERE
        int[] result = Arrays.copyOf(array, array.length);
        sort(result, 0, result.length - 1);

        final long endTime = System.currentTimeMillis();
        this.executionTime = endTime - startTime;
        return result;




    }

    public int[] quickSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] heapSort(int[] array) {
        // IMPLEMENT HERE

        return array;
    }

    public int[] bucketSort(int[] array) {
        //implement here

        return array;
    }

    public int[] shellSort(int[] array) {
        //implement here

        return array;
    }
}
