import java.util.Scanner;
public class LargestFromListOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int largest=0;
        for(int i=0;i<n;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("Largest Number is: "+largest);
    }
}