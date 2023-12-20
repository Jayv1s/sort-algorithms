package exercise;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortIncreaseOrder(new int[]{4, 1, 3, 9, 7})));
        System.out.println(Arrays.toString(sortDecreasingOrder(new int[]{4, 1, 3, 9, 7})));
    }

    public static int[] sortIncreaseOrder(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minorValue = arr[i];
            int positionToSwap = i;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < minorValue) {
                    minorValue = arr[j];
                    positionToSwap = j;
                }
            }

            arr[positionToSwap] = arr[i];
            arr[i] = minorValue;
        }

        return arr;
    }

    public static int[] sortDecreasingOrder(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int higherValue = arr[i];
            int positionToSwap = i;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > higherValue) {
                    higherValue = arr[j];
                    positionToSwap = j;
                }
            }

            arr[positionToSwap] = arr[i];
            arr[i] = higherValue;
        }

        return arr;
    }
}
