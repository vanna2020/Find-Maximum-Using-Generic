package com.bridgelabz;
import java.util.Arrays;

/**
 * Purpose - To find maximum value and increasing the parameter size using generics.
 */

public class FindMaxValue<T extends Comparable<T>> {
    T[] elements;

    public FindMaxValue(T[] elements) {
        this.elements = elements;
    }

    /**
     * Generic method to store values in array and return maximum value.
     * We can store any size parameter
     *  elements : Stores the value  in the array and compare it
     * @return max : Maximum of three values
     */

    public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        T max = elements[lenght - 1];
        System.out.printf("\nThe Maximum value in all of them is : %s ", max);
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximun Problem Using Generics");
        Integer[] intMax = { 10, 24, 68, 80, 42, 46, 12, 58 };
        maxOfValues(intMax);
        Float[] floatMax = { 1.4f, 87.3f, 81.8f, 40.2f, 4.6f };
        maxOfValues(floatMax);
        String[] stringMax = { "ABC", "IJK", "PQR", "BCD", "MNO", "LMN", "RST", "XYZ" };
        maxOfValues(stringMax);
    }
}