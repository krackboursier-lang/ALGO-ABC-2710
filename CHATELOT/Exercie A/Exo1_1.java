import java.util.*;
public class Exo1_1{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        System.out.print("Nombre 1: ");
        double n1=s.nextDouble();
        System.out.print("Nombre 2: ");
        double n2=s.nextDouble();
        System.out.println("Moyenne: "+(n1+n2)/2);
    }
}