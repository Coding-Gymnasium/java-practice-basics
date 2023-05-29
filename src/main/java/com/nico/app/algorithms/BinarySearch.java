package com.nico.app.algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("hello binary search");
        int[] ints = new int[]{1, 2, 4, 5, 7, 9, 11};

        System.out.println("0 is at position: " + binarySearch(ints, 0));
        System.out.println("1 is at position: " + binarySearch(ints, 1));
        System.out.println("2 is at position: " + binarySearch(ints, 2));
        System.out.println("3 is at position: " + binarySearch(ints, 3));
        System.out.println("4 is at position: " + binarySearch(ints, 4));
        System.out.println("5 is at position: " + binarySearch(ints, 5));
        System.out.println("6 is at position: " + binarySearch(ints, 6));
        System.out.println("7 is at position: " + binarySearch(ints, 7));
        System.out.println("8 is at position: " + binarySearch(ints, 8));
        System.out.println("9 is at position: " + binarySearch(ints, 9));
        System.out.println("10 is at position: " + binarySearch(ints, 10));
    }

    /**
     * binarySearch
     * <p>
     * find target number's index
     * using binary search
     *
     * @param numberToFind ( int )
     * @param numbers      ( int[] )
     * @return target number index ( int )
     */


    public static int binarySearch(int[] numbers, int numberToFind) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int midPosition = ( low + high ) / 2;
            int midNumber = numbers[midPosition];
            if (numberToFind == midNumber) {
                return midPosition;
            } else if (numberToFind < midNumber) {
                high = midPosition - 1;
            } else {
                low = midPosition + 1;
            }
        }

        return -1;
    }
}
