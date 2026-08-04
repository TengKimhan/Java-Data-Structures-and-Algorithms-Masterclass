/*
    Time complexity: O(ab)
*/

public class Question5 {
    public static void main(String[] args) {
        Question5 question5 = new Question5();
        question5.printUnorderedPairs(new int[]{1, 2, 3, 4}, new int[]{1, 3, 5, 7});
    }

    void printUnorderedPairs(int[] arrayA, int[] arrayB) {
        for (int i=0; i<arrayA.length; i++) {
            for (int j=0; j<arrayB.length; j++) {
                for (int k=0; k<1000000; k++) {
                    System.out.println(arrayA[i] + "," + arrayB[j]);
                }
            }
        }
    }
}
