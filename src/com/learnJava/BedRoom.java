package com.learnJava;

public class BedRoom {
	// Fields
	private int alaramClock;
	private int bed;
	private int bedSideChest;
	private int carpet;
	private int hairDrayer;
	private int lamp;
	private int pillow;
	
	// Constructor
	public BedRoom(int alaramClock, int bed, int bedSideChest, int carpet, int hairDrayer, int lamp, int pillow) {
		this.alaramClock = alaramClock;
		this.bed = bed;
		this.bedSideChest = bedSideChest;
		this.carpet = carpet;
		this.hairDrayer = hairDrayer;
		this.lamp = lamp;
		this.pillow = pillow;
	}
	
	// Methods
	public void sleep() {
		System.out.println("Sleeping ...");
	}

	// Getters and setters
	public int getAlaramClock() {
		return alaramClock;
	}

	public void setAlaramClock(int alaramClock) {
		this.alaramClock = alaramClock;
	}

	public int getBed() {
		return bed;
	}

	public void setBed(int bed) {
		this.bed = bed;
	}

	public int getBedSideChest() {
		return bedSideChest;
	}

	public void setBedSideChest(int bedSideChest) {
		this.bedSideChest = bedSideChest;
	}

	public int getCarpet() {
		return carpet;
	}

	public void setCarpet(int carpet) {
		this.carpet = carpet;
	}

	public int getHairDrayer() {
		return hairDrayer;
	}

	public void setHairDrayer(int hairDrayer) {
		this.hairDrayer = hairDrayer;
	}

	public int getLamp() {
		return lamp;
	}

	public void setLamp(int lamp) {
		this.lamp = lamp;
	}

	public int getPillow() {
		return pillow;
	}

	public void setPillow(int pillow) {
		this.pillow = pillow;
	}
}
