import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] list) {
        for (int currentIndex = 1; currentIndex < list.length; currentIndex++) {
            int current = list[currentIndex];
            int previousIndex = currentIndex - 1;
            
            while (previousIndex >=0 && list[previousIndex] > current) {
                list[previousIndex + 1] = list[previousIndex];
                previousIndex -= 1;
            }
            list[previousIndex + 1] = current;
        }
    }
    
    public static void main(String[] args) throws Exception {
        int[] list = {4,7,2,5,4,0};
        
        System.out.println("Origin: " + Arrays.toString(list));
        
        insertionSort(list);

        System.out.println("Sort:" + Arrays.toString(list));
    }
}
