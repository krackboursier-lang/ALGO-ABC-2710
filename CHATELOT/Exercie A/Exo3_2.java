import java.util.Scanner;

public class Exo3_2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Somme S (>1) : ");
        int S=s.nextInt(),n=0;
        while(S>0){
            int d=S>1?(S/2)+1:1;
            S-=d;n++;
        }
        System.out.println("Barnabé a fait ses courses dans "+n+" magasins.");
    }
}