import java.util.*;
public class VotreAge{
    public static void main(String[]a){
        Scanner s=new Scanner(System.in);
        System.out.print("Age: ");
        int age=s.nextInt(),r=0;
        if(age<=2)r=1;else if(age<=8)r=2;else if(age<=13)r=3;else if(age<=17)r=4;
        else if(age<=25)r=5;else if(age<=39)r=6;else if(age<=50)r=7;else if(age>50)r=8;
        switch(r){
            case 1:System.out.println("bébé");break;
            case 2:System.out.println("enfant");break;
            case 3:System.out.println("pré-ados");break;
            case 4:System.out.println("Adolescent");break;
            case 5:System.out.println("jeune Adulte");break;
            case 6:System.out.println("adulte");break;
            case 7:System.out.println("adulte mure");break;
            case 8:System.out.println("senior");break;
            default:System.out.println("inconnu");
        }
    }
}