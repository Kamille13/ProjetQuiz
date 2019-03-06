import java.util.Scanner;
import java.util.Arrays;

class ProjetQuiz {

	public static void main (String[] args) {

		Scanner myObj = new Scanner(System.in);
    	String userName;

		System.out.println("Entrer votre nom de joueur : "); 
    	userName = myObj.nextLine(); 
       
    	System.out.println("Nom de joueur : " + userName);

		int score = 0;

		System.out.println (score);

        String [] question1 = new String [] {"Qui est Zelda ?","C","A . Personnage principal","B . Méchant","C . Princesse","D . Animal"};
        String [] question2 = new String [] {"Qui est le meilleur personnage de Smash Bros ?","B","A . Kirby","B . Capitain Falcon","C . Samus","D . Ness"};
        String [] question3 = new String [] {"Qui est le boss final de Mortal Kombat ?","D","A . Scorpion","B . Raiden","C . Sub-Zero","D . Goro"};
        String [] question4 = new String [] {"Comment s'appelle la route multicolor sur Mario Kart ?","A","A . Arc-en-ciel","B . Ile Choco","C . Plaine Donut","D . Château de Bowser"};                                        
		
        String[][] question = new String[][] {
            question1,
            question2,
            question3,
            question4
        };

        

        for (int i = 0; i< question.length; i++) {
            Scanner maLigne = new Scanner(System.in);
            String reponse; 
            System.out.println(question[i][0]);
            System.out.println(question[i][2]);
            System.out.println(question[i][3]);
            System.out.println(question[i][4]);
            System.out.println(question[i][5]);
            System.out.println("Votre Réponse [A-D]:");
            reponse = maLigne.nextLine();
        
            if (reponse.equals(question[i][1])) {
                
                score++;
                System.out.println("Bonne Reponse!");
            }
            else {
                System.out.println("Mauvaise Reponse");
            }
        
        }
        System.out.println("Felicitation " + userName + " Tu as terminé notre Quiz! Ton score est de : " + score);
        
    }
}