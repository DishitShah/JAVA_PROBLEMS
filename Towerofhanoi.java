import java.util.Scanner;

public class Towerofhanoi{
    static int cnt = 1;
    public static void towerOfHanoi(int n,char sou,char des,char help){
        if(n==0){
            return;
        }
        towerOfHanoi(n-1, sou, help, des);
        System.out.println(cnt+" "+"Move disk "+n+" from rod "+sou+" to rod "+des);
        cnt++;
        towerOfHanoi(n-1, help, des, sou);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks");
        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'C', 'B');
    }
}