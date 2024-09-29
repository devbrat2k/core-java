package com.devbrat2k.codility;

import java.util.Arrays;

public class MaxCounterProblem {

    public static void main(String[] args) {
        int[] ci = {3,4,4,6,1,4,4};
        int counterSize = 5;
        System.out.println("Input : " + Arrays.toString(ci));
        System.out.println("Output : " + Arrays.toString(performMaxCounter(counterSize, ci)));
        System.out.println("Optimized Output : " + Arrays.toString(performMaxCounterOptimized(counterSize, ci)));

    }

    public static int[] performMaxCounter(int size, int[] ci) {
        int[] counters = new int[size];
        Arrays.fill(counters, 0);
        int maxCounterValue = 0;
        for (int i = 0; i < ci.length; i++) {
            int pos = ci[i] - 1;
            if (pos < size) {
                counters[pos] = counters[pos] + 1;
                maxCounterValue = maxCounterValue > counters[pos] ? maxCounterValue : counters[pos];
            }
            else {
               // System.out.println( "Replacing all counter by max counter Value : " + maxCounterValue + " , on Iteration-" + i + " : " + Arrays.toString(counters));
                for (int j = 0; j < size; j++) {
                    counters[j] = maxCounterValue;
                }
            }
            //System.out.println("After Iteration-" + i + " : " + Arrays.toString(counters));
        }

        return counters;
    }

    public static int[] performMaxCounterOptimized(int size, int[] ci) {
        int[] counters = new int[size];
        Arrays.fill(counters, 0);
        int maxCounterValue = 0;
        int startLine = 0;
        for (int i = 0; i < ci.length; i++) {
            int pos = ci[i] - 1;
            if(pos >= size)
                startLine = maxCounterValue;
            else if (counters[pos] < startLine)
                counters[pos] = startLine + counters[pos] + 1;
            else
                counters[pos] = counters[pos] + 1;
            if(pos < size && counters[pos] > maxCounterValue)
                maxCounterValue = counters[pos];

            System.out.println("startLine : " + startLine + "maxCounter:  "+ maxCounterValue + " After Iteration-" + i + " : " + Arrays.toString(counters));
        }
        for (int i = 0; i < counters.length; i++) {
            if(counters[i] < startLine)
                counters[i] = startLine ;
        }
        return counters;
    }
}
