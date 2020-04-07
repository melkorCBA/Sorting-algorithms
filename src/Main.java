public class Main {

    public static void main(String[] args) {
        BubbleArray ob=new BubbleArray(6);
        ob.insert(8);
        ob.insert(1);
        ob.insert(5);
        ob.insert(10);
        ob.insert(7);
        ob.insert(3);

//        ob.display();
        ob.bubbleSort();
        ob.display();


    }


}
