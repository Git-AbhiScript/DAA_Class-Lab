import java.io.*;

public class SimpleGCD {

    // Recursive method to compute GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SimpleGCD <inputFile> <outputFile>");
            return;
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into two numbers
                String[] tokens = line.split("\\s+");
                if (tokens.length == 2) {
                    int num1 = Integer.parseInt(tokens[0]);
                    int num2 = Integer.parseInt(tokens[1]);
                    int resultGCD = gcd(num1, num2);

                    // Write the result to the output file
                    writer.write("The GCD of " + num1 + " and " + num2 + " is " + resultGCD);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
