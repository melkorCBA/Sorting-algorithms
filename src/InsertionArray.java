public class InsertionArray {
    private int[] a;
    private int nElements;

    public InsertionArray(int max) {
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

    private void swapArray(int start, int end) {
        while(end>start){
            a[end]=a[--end];

        }
    }

    public void insertionSort(){



        for(int pointer=1; pointer<a.length; pointer++){
            int temp=a[pointer];
            for(int j=0; j<pointer; j++){
                if(a[j]>temp){
                    this.swapArray(j,pointer);
                    a[j]=temp;
                    break;
                }
            }
        }
    }

}
