import java.util.*;

public class Exo3_1 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner s=new Scanner(System.in);
        int m=r.nextInt(101),e,n=0,min=0,max=100;
        System.out.println("Devinez le nombre entre 0 et 100 !");
        do{
            System.out.printf("Essai entre %d et %d : ",min,max);
            e=s.nextInt();n++;
            if(e<m){System.out.println("Trop petit !");min=e+1;}
            else if(e>m){System.out.println("Trop grand !");max=e-1;}
        }while(e!=m);
        System.out.printf("Bravo en %d essais !%n",n);
    }
}