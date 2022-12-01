package jeu;

public class Main {

	public static void main(String[] args) {
		System.out.println("test de combat entre D2r2 et Data\n");
		Arenao virtuel=new Arenao();
		Robot olii=new Robot("D2R2",10);
		Robot state=new Robot("DATA",10);
		
		virtuel.fight(olii, state);

	}

}
