package com.learnJava;

public class LivingRoom {
	// Fields
	private int armchair;
	private int bookcase;
	private int carpet;
	private int coffeeTable;
	private int curtain;
	private int TV;
	private int lamp;
	private int sofa;
	
	// Constructor
	public LivingRoom(int armchair, int bookcase, int carpet, int coffeeTable, int curtain, int tV, int lamp,
			int sofa) {
		this.armchair = armchair;
		this.bookcase = bookcase;
		this.carpet = carpet;
		this.coffeeTable = coffeeTable;
		this.curtain = curtain;
		TV = tV;
		this.lamp = lamp;
		this.sofa = sofa;
	}

	// Getters and setters
	public int getArmchair() {
		return armchair;
	}

	public void setArmchair(int armchair) {
		this.armchair = armchair;
	}

	public int getBookcase() {
		return bookcase;
	}

	public void setBookcase(int bookcase) {
		this.bookcase = bookcase;
	}

	public int getCarpet() {
		return carpet;
	}

	public void setCarpet(int carpet) {
		this.carpet = carpet;
	}

	public int getCoffeeTable() {
		return coffeeTable;
	}

	public void setCoffeeTable(int coffeeTable) {
		this.coffeeTable = coffeeTable;
	}

	public int getCurtain() {
		return curtain;
	}

	public void setCurtain(int curtain) {
		this.curtain = curtain;
	}

	public int getTV() {
		return TV;
	}

	public void setTV(int tV) {
		TV = tV;
	}

	public int getLamp() {
		return lamp;
	}

	public void setLamp(int lamp) {
		this.lamp = lamp;
	}

	public int getSofa() {
		return sofa;
	}

	public void setSofa(int sofa) {
		this.sofa = sofa;
	}
}
