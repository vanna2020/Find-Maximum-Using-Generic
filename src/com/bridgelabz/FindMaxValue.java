package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 */
public class FindMaxValue<T extends Comparable<T>> {

    T a1, a2, a3;

    public FindMaxValue(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

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