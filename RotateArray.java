import java.util.Scanner;

public class RotateArray {

    // Function to swap two elements
    static void EXCHANGE(int[] array, int p, int q) {
        int temp = array[p];
        array[p] = array[q];
        array[q] = temp;
    }

    // Function to rotate the first p2 elements to the right by 1 position
    static void ROTATE_RIGHT(int[] array, int p2) {
        if (p2 <= 1) return; // No rotation needed for 0 or 1 element

        // Perform the rotation
        int last = array[p2 - 1]; // Save the last element of the first p2 elements
        for (int i = p2 - 1; i > 0; i--) {
            array[i] = array[i - 1]; // Shift elements to the right
        }
        array[0] = last; // Place the saved last element at the start
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Read the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the array before rotation
        System.out.print("Before ROTATE: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the ROTATE_RIGHT function
        ROTATE_RIGHT(array, 5);

        // Print the array after rotation
        System.out.print("After ROTATE: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
