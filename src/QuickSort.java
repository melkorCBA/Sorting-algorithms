public class QuickSort {

    public static void main(String[] args) {
        int a[]={34,23,12,64,72,30,45,43,15,28};
        quickSort(a,0,9);
        printArray(a);



    }

    public static int partition(int a[], int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (leftPtr<right && a[++leftPtr] < pivot) ;
            while (rightPtr>left && a[--rightPtr] > pivot) ;

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(a, leftPtr, rightPtr);
            }
        }
        swap(a, leftPtr, right);
        return leftPtr;
    }

    public static void swap(int a[], int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    public static void quickSort(int a[], int left, int right) {
        if (left >= right) {
            return;
        } else {
            int pivot = a[right];
            int partition = partition(a, left, right, pivot);
            quickSort(a, left, partition - 1);
            quickSort(a, partition + 1, right);
        }
    }

    public static void printArray(int a[]){
        for(int x:a){
            System.out.print(x+",");
        }
    }
}
