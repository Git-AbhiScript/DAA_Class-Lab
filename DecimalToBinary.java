import java.util.Scanner;
//import java.io.*;

class DecimalToBinary
{
    static int find(int decimal_number)
    {
        if (decimal_number == 0)
            return 0;
        else

            return (decimal_number % 2 + 10 *
                    find(decimal_number / 2));
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Decimal Number To Convert: ");
        int decimal_number=sc.nextInt();
        System.out.println(find(decimal_number));
    }

}
