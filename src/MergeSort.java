public class MergeSort {

    public static void main(String[] args) {
        int array[] = {23, 47, 81, 95, 98, 7, 14, 39, 55, 62};
        mergeSort(array, 0, array.length - 1);
        printArray(array);


    }

    public static void merge(int a[], int low, int mid, int high) {
        int index, lIndex, rIndex;
        index = low;
        lIndex = 0;
        rIndex = 0;

        int lArraySize = mid + 1 - low;
        int rArraySize = high - mid;

        int lArray[] = new int[lArraySize];
        int rArray[] = new int[rArraySize];

        int i = index;
        //fill two arrays
        int j=0, k = 0;
        while (i < high + 1) {
            if (i < mid + 1) {

                lArray[j++] = a[i];

            } else {

                rArray[k++] = a[i];

            }
            i++;

        }




        while (lIndex < lArraySize && rIndex < rArraySize) {
            if (lArray[lIndex] <= rArray[rIndex]) {
                a[index] = lArray[lIndex];
                lIndex++;
            } else {
                a[index] = rArray[rIndex];
                rIndex++;

            }
            index++;
        }

        while (lIndex < lArraySize) {
            a[index] = lArray[lIndex];
            index++;
            lIndex++;
        }

        while (rIndex < rArraySize) {
            a[index] = rArray[rIndex];
            index++;
            rIndex++;
        }


    }

    public static void mergeSort(int a[], int low, int high) {

        if (low == high) {
            return;
        } else {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }

    }

    public static void printArray(int a[]) {
        for (int x : a) {
            System.out.print(x + ",");
        }
    }

    public static void merges(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}


