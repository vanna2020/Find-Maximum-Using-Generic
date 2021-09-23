package com.bridgelabz;
import java.util.Arrays;

/**
 * Purpose - To find maximum value and increasing the parameter size using generics
 */

public class FindMaxValue<T extends Comparable<T>> {

    T[] elements;

    public FindMaxValue(T[] elements) {
        this.elements = elements;
    }

    /**
     * Generic method to store values in array and return maximum value.
     * We can store any size parameter
     *  elements : Stores the array value and compare it
     * @return max : Maximum of three values
     */

    public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        T max = elements[lenght - 1];
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximun Problem Using Generics \n");
        Integer[] intMax = { 10, 24, 68, 80, 42, 46, 12, 58 };
        System.out.println("The maximum value between the three integer is : " + maxOfValues(intMax)+ "\n");
        Float[] floatMax = { 1.4f, 87.3f, 81.8f, 40.2f, 4.6f };
        System.out.println("The maximum value between the three float is : " + maxOfValues(floatMax)+ "\n");
        String[] stringMax = { "ABC", "IJK", "PQR", "BCD", "MNO", "LMN", "RST", "XYZ" };
        System.out.println("The maximum value between the three string is : " + maxOfValues(stringMax));
    }
}