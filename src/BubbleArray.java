public class BubbleArray {
    private int[] a;
    private int nElements;

    public BubbleArray(int max) {
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

    public void bubbleSort() {

        int sorted = nElements;
        while (sorted > 0) {
            int pointer = 0;
            while (pointer + 1 < sorted) {
                if (a[pointer] > a[pointer + 1]) {
                    this.swap(pointer, pointer + 1);
                }
                pointer++;
            }
            sorted--;

        }
    }
}