public class SingleDimensionArray {
    int[] array = null;

    public SingleDimensionArray(int size) {
        array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if (array[location] == Integer.MIN_VALUE) {
                array[location] = value;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverse() {
        try {
            for (int i=0; i<array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array does not exist anymore");
        }
    }

    public void searchInArray(int valueToSearch) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == valueToSearch) {
                System.out.println("Value is found at the index of " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValue(int valueToDeleteIndex) {
        try {
            array[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range");
        }
    }
}
