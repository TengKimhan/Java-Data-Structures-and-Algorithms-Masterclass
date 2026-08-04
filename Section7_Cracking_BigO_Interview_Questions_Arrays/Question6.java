/*
    Time complexity: O(n)
*/

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        Question6 question6 = new Question6();
        question6.reverse(new int[]{1, 2, 3, 4, 5});
    }

    void reverse(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            int other = array.length - i - 1; // the element from the end of array
            int temp = array[i];
            array[i] = array[other];
            array[other] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
