/*
    Time complexity: O(n^2)
*/

public class Question3 {
    public static void main(String[] args) {
        Question3 main = new Question3();
        int[] customArray = {1, 3, 4, 5};
        main.printUnorderedPairs(customArray);
    }

    void printUnorderedPairs(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
