public class TwoDimensionArray {
    int[][] array;

    public TwoDimensionArray(int row, int col) {
        array = new int[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                array[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (array[row][col] == Integer.MIN_VALUE) {
                array[row][col] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void accessCell(int row, int col) {
        try {
            System.out.println("The cell value is: " + array[row][col]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverse() {
        try {
            for (int i=0; i<array.length; i++) {
                for (int j=0; j<array[i].length; j++)
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Array does not exist anymore");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                if (array[i][j] == valueToSearch) {
                    System.out.println("Value is found at row: " + i + ", column: " + j);
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValue(int rowToDelete, int colToDelete) {
        try {
            array[rowToDelete][colToDelete] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range");
        }
    }
}
