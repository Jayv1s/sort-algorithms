import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(handMadeAlgorithm()));
        System.out.println(Arrays.toString(improveHandMadeOne()));
    }

    public static int[] handMadeAlgorithm() {
        int[] unsortedList = new int[] {55, 33, 11, 99, 77};
        int[] sortedList = new int[unsortedList.length];

        boolean finished = false;
        int cnt = 0;

        do {
            if(cnt == unsortedList.length) {
                finished = true;
            } else {
                int smallestValue = unsortedList[cnt];
                int posToSwap = cnt;

                for(int i = cnt; i < unsortedList.length; i ++) {
                    if(unsortedList[i] < smallestValue) { // 77 < 99 ?
                        smallestValue = unsortedList[i]; // 77
                        posToSwap = i; // 4
                    }
                }

                unsortedList[posToSwap] = unsortedList[cnt]; // index 3 -> valor 55;
                sortedList[cnt] = smallestValue; // index 0 -> 11

                ++cnt;
            }
        } while (!finished);

        return sortedList;
    }

    public static int[] improveHandMadeOne() {
        int[] myList = new int[] {55, 33, 11, 99, 77};

        for(int i = 0; i < myList.length; i++) {
            int smallest = myList[i];
            int positionOfSmallest = i;

            for (int j = i+1; j< myList.length; j++) {
                if(myList[j] < smallest) {
                    smallest = myList[j];
                    positionOfSmallest = j;
                }
            }

            myList[positionOfSmallest] = myList[i];
            myList[i] = smallest;
        }

        return myList;
    }
}