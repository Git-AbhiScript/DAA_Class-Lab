
import java.util.Scanner;
public class OddEvenSeperate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Elements: ");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.print("Enter The Elements: ");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int odd=0;
        int even=n-1;

        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(num[i]%2==0){
                result[even--]=num[i];
            }
            else{
                result[odd++]=num[i];
            }
        }
        System.out.println("Rearranged Array is:");
        for(int i=0;i<n;i++) {
            System.out.print(result[i]+" ");
        }


    }
}
