/*
    Time complexity: O(n)
*/

public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        int[] customArray = {1, 3, 4, 5};
        question1.spofArray(customArray);
    }

    void spofArray(int[] array) {
        int sum = 0;
        int product = 1;

        for (int i=0; i<array.length; i++) {
            sum+=array[i];
        }

        for (int i=0; i<array.length; i++) {
            product*=array[i];
        }

        System.out.println(sum + ", " + product);
    }
}
