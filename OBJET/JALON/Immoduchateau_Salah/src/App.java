
public class App {
    private static final char[] Revenu = null;
    private static Client Client;
    private static Intervenant Intervenant;
    private static Intervention Intervention;
    private static String Charge;

    public static void main(String[] args) throws Exception

    {

        Client = new Client(8, "Chemin des fauvettes ", 74150, "Rumilly");
        Intervenant = new Intervenant(0654321, 450, 2150);
        Intervention = new Intervention(65, "Place du pont", 69000, "Lyon");

        Client client = new Client(15, "Pasteur", 68000, "Mulhouse");
        Intervention Intervention = new Intervention(5, "Pasteur", 90000, "Belfort");
        Intervenant Intervenant = new Intervenant(654321, 45, 2150);
        System.out.println(Revenu);

        double resultat = Revenu.length;
        System.out.println("-------Revenu : " + resultat + Charge);

    }

}
