import java.util.Scanner;
public class question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any characterfrom english alphbet:");
        char a=sc.next().toLowerCase().charAt(0);
        if(a=='a'|| a=='e'|| a=='i'||a=='o'||a=='u'){
            System.out.println("It's vowel");
        }
        else{
            System.out.println("It's Consonant");
        }
    }
}
