/*
    Best Score
    Given an array, write a function to get first, second best scores from the array and return it in new array.

    Array may contain duplicates.

    Example

    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
*/

import java.util.Arrays;

public class CodingExercise3BestScore {
    public static void main(String[] args) {
        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(firstSecond(myArray)));
    }

    public static int[] firstSecond(int[] array) {
        int firstScore = Integer.MIN_VALUE;
        int secondScore = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstScore) {
                secondScore = firstScore;
                firstScore = score;
            } else if (score > secondScore && score < firstScore) {
                secondScore = score;
            }
        }

        return new int[]{firstScore, secondScore};
    }

    /* Solution 2
    public static int[] firstSecond(int[] array) {
        // sort array in descending order
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] <= array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return new int[]{array[0], array[1]};
    }
     */
}
