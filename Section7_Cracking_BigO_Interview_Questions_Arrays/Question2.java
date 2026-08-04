/*
    Time complexity: O(n^2)
*/

public class Question2 {
    public static void main(String[] args) {
        Question2 main = new Question2();
        int[] customArray = {1, 3, 4, 5};
        main.printPairs(customArray);
    }

    void printPairs(int[] array) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.println(array[i] + ", " + array[j]);
            }
        }
    }
}
