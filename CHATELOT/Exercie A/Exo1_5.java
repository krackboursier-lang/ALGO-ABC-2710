import java.util.Scanner;

public class Exo1_5 { 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("a: ");
        int a=s.nextInt();
        System.out.print("b: ");
        int b=s.nextInt();
        System.out.println("AVANT: a="+a+" b="+b);
        int t=a;a=b;b=t;
        System.out.println("APRES: a="+a+" b="+b);
    }
}