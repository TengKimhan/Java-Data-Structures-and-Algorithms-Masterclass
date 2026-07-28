/*
    Middle Function
    Write a function called middle that takes an array
    and returns a new array that contains all but the first and last elements.

    myArray = [1, 2, 3, 4]
    middle(myArray)  # [2,3].
*/

import java.util.Arrays;

public class CodingExercise1MiddleFunction {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(middle(myArray)));
    }

    public static int[] middle(int[] array) {
        int[] result = new int[array.length - 2];

        for (int i=0; i<array.length - 2; i++) result[i] = array[i+1];
        return result;
    }
}
