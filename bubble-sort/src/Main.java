import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSorting(new int[]{6, 0, 3, 5})));
    }

    public static int[] bubbleSorting(int[] arr) {
//        while(true) {
//            for(int i = 0; i < arr.length-1; i ++) {
//                if(arr[i] > arr[i+1]) {
//                    int nextPosValue = arr[i+1];
//                    arr[i+1] = arr[i];
//                    arr[i] = nextPosValue;
//                }
//            }
//        }

        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int nextPosValue = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = nextPosValue;
                }
            }
        }

        return arr;
    }
}