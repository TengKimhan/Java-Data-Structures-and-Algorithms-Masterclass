/*
    Max Product of Two Integers
    How to find maximum product of two integers in the array where all elements are positive.

    Example

    int[] intArray = {10,20,30,40,50};
    maxProduct(intArray) // (40,50)
*/

public class CodingExercise10MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        System.out.println(maxProduct(intArray));
    }

    public static String maxProduct(int[] intArray) {
        int max = Integer.MIN_VALUE;
        int a=0;
        int b=0;
        for (int i=0; i<intArray.length; i++) {
            for (int j=i+1; j<intArray.length; j++) {
                if ((intArray[i] * intArray[j]) > max) {
                    max = intArray[i] * intArray[j];
                    a = intArray[i];
                    b = intArray[j];
                }
            }
        }

        return "(" + a + "," + b + ")";
    }
}
