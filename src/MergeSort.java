import java.util.Arrays;

public class MergeSort {
    
    static int[] mergeSort(int[] list) {
        
        if (list.length <= 1 ) {
            return list;
        }

        int middle = list.length / 2;

        int[] leftList = createLeftList(list, middle);
        int[] rightList = createRightList(list, middle);

        loopFor(leftList, middle, list, 0);
        loopFor(rightList, rightList.length, list, middle);
        
        leftList = mergeSort(leftList);
        rightList = mergeSort(rightList);
        
        int[] orderedList = new int[list.length];

        orderedList = merge(leftList, rightList);

        return orderedList;

    }


    static int[] createLeftList(int[] list, int middle) {
        int[] leftList = new int[middle];
        return leftList;
    }


    static int[] createRightList(int[] list, int middle) {
        int[] rightList;
    
        if ( list.length % 2 == 0 ) {
            rightList = new int[middle];

        } else {
            rightList = new int[middle + 1];
        }
        return rightList;

    }


    static int[] loopFor(int[] listToReceiveValue, int listLength, int[] listToBeAssigned, int incrementedIndex) {
        for (int index = 0; index < listLength; index++) {
            listToReceiveValue[index] = listToBeAssigned[incrementedIndex > 0 ? index + incrementedIndex : index];
        }

        return listToReceiveValue;
    }

    
    static int[] merge(int[] leftList, int[] rightList) {

        int[] orderedList = new int[leftList.length + rightList.length];

        int topCardFromTheLeft = 0;
        int topCardFromTheRight = 0;
        int resultantList = 0;

        for ( int index = 0; index < orderedList.length; index++ ) {
            
            while ( topCardFromTheLeft < leftList.length || topCardFromTheRight < rightList.length ) {

                if (topCardFromTheLeft < leftList.length && topCardFromTheRight < rightList.length) {
                    
                    if ( leftList[topCardFromTheLeft] < rightList[topCardFromTheRight] ) {
                        orderedList[resultantList++] = leftList[topCardFromTheLeft++];
        
                    } else {
                        orderedList[resultantList++] = rightList[topCardFromTheRight++];
                    }
                    
                } else if ( topCardFromTheLeft < leftList.length ) {
                    orderedList[resultantList++] = leftList[topCardFromTheLeft++];

                } else if ( topCardFromTheRight < rightList.length ) {
                    orderedList[resultantList++] = rightList[topCardFromTheRight++];

                }
            }
        }

        return orderedList;
        
    }

    public static void main(String[] args) {

        int[] list = {2,4,5,7,1,2,3,6};

        System.out.println("Origin: " + Arrays.toString(list));

        int[] orderedList = mergeSort(list);

        System.out.println("Sort: " + Arrays.toString(orderedList));

    }
}
