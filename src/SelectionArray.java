public class SelectionArray {

    private int[] a;
    private int nElements;

    public SelectionArray(int max) {
        a = new int[max];
        nElements = 0;
    }

    public void insert(int value) {

        a[nElements] = value;
        nElements++;
    }

    public void display() {
        for (int value : a) {
            System.out.print(value + ",");
        }
    }

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void selectionSort() {
        int sorted=-1;
    while(sorted<a.length-1) {
        int minIndex = sorted+1;
        for (int i = sorted + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        this.swap(sorted + 1, minIndex);
        sorted++;
    }


    }


}


