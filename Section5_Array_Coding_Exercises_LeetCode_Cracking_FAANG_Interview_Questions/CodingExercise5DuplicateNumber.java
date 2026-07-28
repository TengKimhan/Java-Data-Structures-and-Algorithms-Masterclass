/*
    Duplicate Number
    Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)

    Example

    removeDuplicates({1, 1, 2, 2, 3, 4, 5})
    Output : [1, 2, 3, 4, 5]
*/

import java.util.Arrays;

public class CodingExercise5DuplicateNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5})));
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] result = new int[n];
        int index = 0;

        for (int i=0; i<n; i++) {
            boolean isDuplicate = false;
            for (int j=i+1; j<n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result[index++] = array[i];
            }
        }

        return Arrays.copyOf(result, index);
    }

    /* Solution 2: Using Hashset
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            if (!set.contains(a)) set.add(a);
        }

        int n = set.size();
        int i=0;
        int[] result = new int[n];
        for (int s : set) {
            result[i] = s;
            i++;
        }

        return result;
      }
    */
}
