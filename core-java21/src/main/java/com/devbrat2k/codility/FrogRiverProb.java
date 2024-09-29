package com.devbrat2k.codility;

import java.util.Arrays;

public class FrogRiverProb {
    public static void main(String[] args) {
        int[] a =  {1,3,1,4,2,3,5,4};
        System.out.println(findMinTimeToCross(5,a));
        System.out.println(findMinTimeToCrossWithBoolean(5,a));
    }
    public static int findMinTimeToCross(int x, int[] a) {
        int length = a.length; int[] a1 = new int[x]; int counter = 0;
        for (int i = 0; i < length; i++) {
            int position = a[i] - 1;
            if(a1[position] != 1) {
                a1[position] = 1 ;
                counter++;
            }
            if (counter == x){
                return i;
            }
        }
        return -1;
    }
    public static int findMinTimeToCrossWithBoolean(int x, int[] a) {
        int length = a.length;
        boolean[] booleans = new boolean[x];
        System.out.println(Arrays.toString(booleans));

        for (int time = 0; time < length; time++) {
            int position = a[time] - 1;
            if(!booleans[position]) {
                booleans[position] = true ;
                x--;
            }
            if (x == 0){
                return time;
            }
        }
        return -1;
    }

    public static void printArray(Object[] objects) {

    }
}
