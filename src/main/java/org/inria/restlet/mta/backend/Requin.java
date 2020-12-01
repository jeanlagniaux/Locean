package org.inria.restlet.mta.backend;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Requin extends Thread{

	private static final int lifeMax = 10;
	private int lifeRemaining;
	
	public Requin() {
		this.lifeRemaining = lifeMax;
	}
	
	public void run() {
		seDeplacer();
		System.out.println("le camion a fini de faire travailler");
	}

	public void seDeplacer(){
		System.out.println("Le requin se d�place");
		
		while(getLifeRemaining() != 0){
			setLifeRemaining(getLifeRemaining()-1);
			System.out.println("Il reste "+getLifeRemaining()+" cycles de vie au requin");
		}
		System.out.println("Le requin a fini de chasser dans cette r�gion de l'oc�an");
	}

	public int getLifeRemaining() {
		return lifeRemaining;
	}

	public void setLifeRemaining(int lifeRemaining) {
		this.lifeRemaining = lifeRemaining;
	}
}
