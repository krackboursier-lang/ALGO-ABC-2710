import java.util.Scanner;

public class VotreAge {
 
    public static void main(String[] args) {


         Scanner clavier = new Scanner(System.in); 

        int age;
        int ageRank=0;

        System.out.println("Donnez votre âge :");

        age = clavier.nextInt();

            if(age>=0 && age<=2){ageRank=1;} 
            if(age>2 && age<=8){ageRank=2;} 
            if(age>8 && age<=13){ageRank=3;} 
            if(age>14 && age<=17){ageRank=4;} 
            if(age>17 && age<=25){ageRank=5;} 
          if(age>25 && age<=39){ageRank=6;} 
          if(age>39 && age<=50){ageRank=7;} 
          if(age>50){ageRank=8;} 

        switch(ageRank){ 
            
            case 1:
                System.out.println("Vous êtes un bébé");
                break;
            case 2:
                System.out.println("Vous êtes un enfant");
                break;
            case 3:
                 System.out.println("Vous êtes un pré-ados");
                break;
            case 4:
                 System.out.println("Vous êtes un Adolescents");
                break;
            case 5 :
                 System.out.println("Vous êtes un jeune Adulte");
                break;
            case 6 :
                 System.out.println("Vous êtes un adulte");
                break;
            case 7 :
                 System.out.println("Vous êtes un adulte mure");
                break;
            case 8 :
                 System.out.println("Vous êtes un senior");
                break;
            default:
                System.out.println("Age inconnu");

        

    }


        clavier.close();
        

    }
    
}

