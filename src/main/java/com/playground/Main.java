package com.playground;


import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = IntStream.rangeClosed(1, 1000000).toArray();
        long startTime = System.nanoTime(); // stopwatch preferred but not need for now
        // TODO: implement linear search if needed to compare performance
        int foundIndex = BinarySearch.search(sortedArray, 900000);
        long endTime = System.nanoTime();
        double processingTime = (endTime - startTime) / 1000000000.0;
        System.out.println("found index: " + foundIndex);
        System.out.println("processing in sec: " + processingTime);
    }
}