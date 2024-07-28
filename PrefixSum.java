import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int[] prefixSum = new int[n];

        // Read array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate prefix sum
        prefixSum[0] = arr[0]; // The first element is the same
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Print the prefix sum array
        System.out.println("Prefix sum array:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }

        scanner.close();
    }
}
