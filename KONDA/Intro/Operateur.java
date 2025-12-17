
public class Operateur {

            public static void main(String[] args) {
                
                int x = 5;
                int y = 2;
                boolean a = true;
                boolean b = false;

                int addition = x + y; /* On fait l'addition */
                int soustratction = x - y; /* On fait la soustraction */
                int multiplication = x * y; /* On fait la multiplication */
                double division = (double)x / (double)y; /* On fait la division */
                int modulo = x % y; /* On fait le modulo */

                boolean ou = a || b; /* On fait comparaison Ou */
                boolean et = a && b; /* On fait comparaison ET */
                boolean non = !a; /* L'inverse Non */
                boolean ouExclusif = a ^ b;/* On fait comparaison Ou Exclusif */

                System.out.println("L'addition de x et y:"+addition);
                System.out.println("La soustratction de x et y:"+soustratction);
                System.out.println("La multiplication de x et y:"+multiplication);
                System.out.println("La division de x et y:"+division);
                System.out.println("Le modulo de x et y:"+modulo);
                System.out.println("Fonction OU de a et b:"+ou);
                System.out.println("Fonction ET de a et b:"+et);
              System.out.println("Fonction NON de a:"+non);
                System.out.println("Fonction Ou Exclusif de a et b:"+ouExclusif);            
            }
    
}
