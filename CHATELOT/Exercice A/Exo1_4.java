import java.util.Scanner;
import java.text.DecimalFormat;

public class Exo1_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        
        System.out.print("Somme S: ");
        double S=s.nextDouble();
        System.out.print("Taux i (ex: 0.05): ");
        double i=s.nextDouble();
        System.out.print("Années N: ");
        int N=s.nextInt();
        
        double vs=S*(1+N*i);
        double vc=S*Math.pow(1+i,N);
        
        System.out.println("\nRésultats après "+N+" ans:");
        System.out.println("Intérêt simple: "+df.format(vs));
        System.out.println("Intérêt composé: "+df.format(vc));
    }
}