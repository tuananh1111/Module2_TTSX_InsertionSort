import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i=1;i<list.length;i++){
            int currentMin= list[i];
            int j=i-1;
            for (;j>=0 && currentMin<list[j];j--){
                list[j+1]=list[j];
            }
            list[j+1]=currentMin;
        }
    }
    public static void printList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
    static int[] array={1,3,2,8,6,4,2,5};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
//        printList(array);
        System.out.println("After use insertionSort : ");
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
