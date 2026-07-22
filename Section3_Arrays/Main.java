import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        // Create an Array
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"a", "b", "c"};
        System.out.println(Arrays.toString(strArray));

        // Insertion in Array
        SingleDimensionArray array = new SingleDimensionArray(5);
        array.insert(0, 1);
        array.insert(1, 2);
        array.insert(1, 2);
        array.insert(2, 2);
        array.insert(3, 3);
        array.insert(6, 2);

        // Accessing Elements in Array
        System.out.println(array.array[0]);

        // Array Traversal
        array.traverse();

        // Search for array element
        System.out.println();
        array.searchInArray(7);

        // Delete Array Element
        array.deleteValue(0);
        array.traverse();

        // Two Dimensional Array
        int[][] twoDimArr = new int[2][2];
        twoDimArr[0][0] = 1;
        twoDimArr[0][1] = 2;
        twoDimArr[1][0] = 3;
        twoDimArr[1][1] = 4;
        System.out.println();
        System.out.println(Arrays.deepToString(twoDimArr));

        String[][] twoDimStr = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(twoDimStr));

        TwoDimensionArray twoDimArray = new TwoDimensionArray(2, 2);
        twoDimArray.insert(0, 0, 10);

        // Accessing Two Dimensional Array Element
        twoDimArray.accessCell(0, 0);

        // Traverse Two Dimensional Array
        twoDimArray.traverse();

        // Searching Two Dimensional Array
        twoDimArray.searchInArray(12);

        // Delete Element in Two Dimensional Array
        twoDimArray.deleteValue(0, 0);
        twoDimArray.traverse();
    }
}