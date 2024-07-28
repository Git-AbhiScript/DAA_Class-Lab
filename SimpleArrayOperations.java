import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleArrayOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Initialize array and frequency map
        int[] array = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Read array elements and update frequency map
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            array[i] = num;
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Variables to track duplicates and most frequent element
        int totalDuplicates = 0;
        int mostFrequentElement = array[0];
        int maxFrequency = 0;

        // Analyze frequency map
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > 1) {
                totalDuplicates++;
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentElement = number;
            }
        }

        // Output results
        System.out.println("Total number of duplicate values = " + totalDuplicates);
        System.out.println("The most repeating element in the array = " + mostFrequentElement);

        scanner.close();
    }
}
