package data_structures._02_non_primitive._01_array;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        /* Declaration of Array: */
        int[] arrInt = { 1, 2, 3, 4, 5 };
        char[] arrChar = { 'a', 'b', 'c', 'd', 'e' };
        float[] arrFloat = { 1.4f, 2.0f, 24f, 5.0f, 0.0f };

        // Static Array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Dynamic Integer Array
        ArrayList<Integer> arrList = new ArrayList<>();

        // Traversing over arrInt[]
        for (int number : arrInt) {
            System.out.print(number + " ");
        }
        System.out.println();

        insertElement(arrInt, 4, 6, 0);

        for (int number : arrInt) {
            System.out.print(number + " ");
        }

        deleteElement(arrInt, 4, 6);

        System.out.println();

        for (int number : arrInt) {
            System.out.print(number + " ");
        }
    }

    // Insertion in Array
    public static void insertElement(int[] arr, int n, int x, int pos) {
        // shift elements to the right
        // which are on the right side of pos
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    // function to search a key to
    // be deleted
    public static int findElement(int arr[], int n, int key) {
        int i;
        for (i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        // Return -1 if key is not found
        return -1;
    }

    // Function to delete an element
    public static int deleteElement(int arr[], int n, int key) {
        // Find position of element to be
        // deleted
        int pos = findElement(arr, n, key);

        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }

        // Deleting element
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        return n - 1;
    }
}
