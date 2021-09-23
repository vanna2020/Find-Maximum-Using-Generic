package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 */
public class FindMaxValue {

    /**
     * Generic method to compare any type of data and find maximum
     *  a1 : First value to compare
     *  a2 : Second value to compare
     *  a3 : Third value to compare
     * @return max : Maximum of three values
     */

    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
        T max = a1;
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximun Problem Using Generics \n");
        System.out.println("The maximum value between the three integer is : " + maxOfValues(4, 8, 5)+ "\n");
        System.out.println("The maximum value between the three float is : " + maxOfValues(1.2f, 3.2f, 5.2f) + "\n");
        System.out.println("The maximum value between the three string is : " + maxOfValues("abc", "pqr", "xyz"));
    }
}