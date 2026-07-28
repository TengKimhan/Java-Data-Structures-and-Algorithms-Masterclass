/*
    Permutation
    You are given two integer arrays. Write a program to check if they are permutation of each other.

    Example

    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,1,2,3,4};
    permutation(array1, array2)
    Output

    true
*/

public class CodingExercise12Permutation {
    public static void main(String[] args) {
        System.out.println(permutation(new int[]{1,2,3,4,5}, new int[]{5,1,2,3,4}));
    }

    public static boolean permutation(int[] array1, int[] array2) {
        int sumArr1 = 0;
        int sumArr2 = 0;
        int mulArr1 = 1;
        int mulArr2 = 1;

        for (int item : array1) {
            sumArr1+=item;
            mulArr1*=item;
        }
        for (int item : array2) {
            sumArr2+=item;
            mulArr2*=item;
        }

        if ((sumArr1==sumArr2) && (mulArr1==mulArr2)) return true;
        return false;
    }
}
