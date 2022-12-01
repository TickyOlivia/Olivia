package jeu;

public class Robot {
private String nom;
int nv;
		// TODO Auto-generated method stub
		public Robot() {
		this.nom=" ";
		this.nv=10;
	}
	public Robot(String nom,int nv) {
		this.nom=nom;
		this.nv=10;
	}
	public String getnom() {
		return nom;
	}	
	public int getnv() {
		return nv;
	}
	public void setnom(String nom) {
		this.nom=nom;
	}
	public void setnv(int nv) {
		this.nv=nv;
	}
	public void affiche(String nom) {
		System.out.println("Robot " + nom);
	}
	
	public void fire(Robot x, Robot y ) {
		x.nv -=2;
		System.out.println("Robot " + x.nom + " a ete touche par " + y.nom);
	}
	public void isDead(Robot x) {
		if(nv == 0) {
			System.out.println("Totalement mort !");
		}
		else {
			System.out.println("Encore en vie avec " + x.nv+ "vies");
		}
	}
	
}

