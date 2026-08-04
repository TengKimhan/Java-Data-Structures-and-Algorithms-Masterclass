/*
    Time complexity: O(ab)
*/

public class Question4 {
    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.printUnorderedPairs(new int[]{1, 2, 3, 4}, new int[]{1, 3, 5, 7});
    }

    void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i=0; i<arrayA.length; i++) {
            for (int j=0; j<arrayB.length; j++) {
                if (arrayA[i] < arrayB[j]) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }
}
