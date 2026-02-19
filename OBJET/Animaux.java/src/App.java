// Classe Main pour tester
public class App {
    public static void main(String[] args) {
        Chien monChien = new Chien("Rex", 3);
        Chat monChat = new Chat("Moustache", 2);

        monChien.faireDuBruit(); // Affiche: Woof! Woof!
        monChat.faireDuBruit();  // Affiche: Miaou! Miaou!
    }
}


