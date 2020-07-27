package com.learnJava;

public class Bathroom {
	// Fields
	private int bath;
	private int toilet;
	private int comb;
	private int towel;
	private int toothBrush;
	private int shower;
	private int toiletPaper;
	private int sink;
	
	// Constructor
	public Bathroom(int bath, int toilet, int comb, int towel, int toothBrush, int shower, int toiletPaper, int sink) {
		this.bath = bath;
		this.toilet = toilet;
		this.comb = comb;
		this.towel = towel;
		this.toothBrush = toothBrush;
		this.shower = shower;
		this.toiletPaper = toiletPaper;
		this.sink = sink;
	}

	// Getters and setters
	public int getBath() {
		return bath;
	}

	public void setBath(int bath) {
		this.bath = bath;
	}

	public int getToilet() {
		return toilet;
	}

	public void setToilet(int toilet) {
		this.toilet = toilet;
	}

	public int getComb() {
		return comb;
	}

	public void setComb(int comb) {
		this.comb = comb;
	}

	public int getTowel() {
		return towel;
	}

	public void setTowel(int towel) {
		this.towel = towel;
	}

	public int getToothBrush() {
		return toothBrush;
	}

	public void setToothBrush(int toothBrush) {
		this.toothBrush = toothBrush;
	}

	public int getShower() {
		return shower;
	}

	public void setShower(int shower) {
		this.shower = shower;
	}

	public int getToiletPaper() {
		return toiletPaper;
	}

	public void setToiletPaper(int toiletPaper) {
		this.toiletPaper = toiletPaper;
	}

	public int getSink() {
		return sink;
	}

	public void setSink(int sink) {
		this.sink = sink;
	}
	
}	
