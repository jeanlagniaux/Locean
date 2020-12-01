package org.inria.restlet.mta.backend;

import java.util.Random;

public class Zone {

	private int nbSardine;
	private int coordX;
	private int coordY;
	private Boolean hasRequin;
	
	public Zone(int coordX, int coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.hasRequin = false;
		Random rand = new Random();
		this.nbSardine = rand.nextInt(6);
	}

	public int getNbSardine() {
		return nbSardine;
	}

	public void setNbSardine(int nbSardine) {
		this.nbSardine = nbSardine;
	}
	
	public Boolean getHasRequin() {
		return hasRequin;
	}

	public void setHasRequin(Boolean hasRequin) {
		this.hasRequin = hasRequin;
	}	

}
