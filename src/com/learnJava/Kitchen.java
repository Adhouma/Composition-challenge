package com.learnJava;

public class Kitchen {
	// Fields
	private int cooker;
	private int fridge;
	private int coffeMachine;
	private int microwave;
	private int mug;
	private int spoon;
	private int washingMachine;
	private int bowl;
	private int knife;
	
	// Constructor
	public Kitchen(int cooker, int fridge, int coffeMachine, int microwave, int mug, int spoon, int washingMachine,
			int bowl, int knife) {
		this.cooker = cooker;
		this.fridge = fridge;
		this.coffeMachine = coffeMachine;
		this.microwave = microwave;
		this.mug = mug;
		this.spoon = spoon;
		this.washingMachine = washingMachine;
		this.bowl = bowl;
		this.knife = knife;
	}
	
	// Methods
	public void cook(String meal) {
		System.out.println("Cooking " + meal);
	}

	// Getters and setters
	public int getCooker() {
		return cooker;
	}

	public void setCooker(int cooker) {
		this.cooker = cooker;
	}

	public int getFridge() {
		return fridge;
	}

	public void setFridge(int fridge) {
		this.fridge = fridge;
	}

	public int getCoffeMachine() {
		return coffeMachine;
	}

	public void setCoffeMachine(int coffeMachine) {
		this.coffeMachine = coffeMachine;
	}

	public int getMicrowave() {
		return microwave;
	}

	public void setMicrowave(int microwave) {
		this.microwave = microwave;
	}

	public int getMug() {
		return mug;
	}

	public void setMug(int mug) {
		this.mug = mug;
	}

	public int getSpoon() {
		return spoon;
	}

	public void setSpoon(int spoon) {
		this.spoon = spoon;
	}

	public int getWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(int washingMachine) {
		this.washingMachine = washingMachine;
	}

	public int getBowl() {
		return bowl;
	}

	public void setBowl(int bowl) {
		this.bowl = bowl;
	}

	public int getKnife() {
		return knife;
	}

	public void setKnife(int knife) {
		this.knife = knife;
	}
}
