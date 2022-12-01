package jeu;

public class Arenao {
	public Robot fight(Robot r1,Robot r2) {
	do {
		r1.fire(r2,r1);
		r2.fire(r1,r2);
		
		r1.setnv(r1.nv);
		r2.setnv(r2.nv);
		
		r1.isDead(r1);
		r2.isDead(r2);
	}
	while(r1.nv>0 && r2.nv>0);
	
	
	if(r1.nv>0) {
		return r1;   
	}
	else {
		return r2;
	}
	}
}


