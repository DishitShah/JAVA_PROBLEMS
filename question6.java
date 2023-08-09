import java.util.Scanner;
public class question6 {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<10;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println("Total number of odd integers in the given array of 10 elements is "+count);
}
}
//8.	Write a Java program to count total number of odd integers in the given array of 10 elements.