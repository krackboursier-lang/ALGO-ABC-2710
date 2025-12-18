import java.util.Scanner;

public class Exo1_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Rayon R: ");
        double R=s.nextDouble();
        System.out.print("Angle A (degrés): ");
        double A=s.nextDouble();
        double aire=(Math.PI*R*R*A)/360;
        System.out.println("Aire secteur: "+aire);
    }
}