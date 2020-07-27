package com.learnJava;

public class House {
	// Fields
	private LivingRoom livingRoom;
	private BedRoom bedRoom;
	private Kitchen kitchen;
	private Bathroom bathroom;
	
	// Constructor
	public House(LivingRoom livingRoom, BedRoom bedRoom, Kitchen kitchen, Bathroom bathroom) {
		this.livingRoom = livingRoom;
		this.bedRoom = bedRoom;
		this.kitchen = kitchen;
		this.bathroom = bathroom;
	}
	
	// Methods
	public void sleep() {
		bedRoom.sleep();
	}

	// Getters
	private LivingRoom getLivingRoom() {
		return livingRoom;
	}

	private BedRoom getBedRoom() {
		return bedRoom;
	}

	public Kitchen getKitchen() {
		return kitchen;
	}

	public Bathroom getBathroom() {
		return bathroom;
	}
}
