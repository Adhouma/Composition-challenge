package com.learnJava;

public class Main {

	/**
	 * Create a house using composition.
	 * Think about the things that should be included in the room.
	 * Maybe physical parts of the house but furniture as well
	 * Add at least one method to access an object via a getter and
	 * then that objects public method as you saw in the previous video
	 * then add at least one method to hide the object e.g. not using a getter
	 * but to access the object used in composition within the main class
	 */
	public static void main(String[] args) {
		// armchair, bookcase, carpet, coffeeTable, curtain, tV, lamp, sofa
		LivingRoom livingRoom = new LivingRoom(1, 1, 1, 1, 1, 1, 2, 1);
		// cooker, fridge, coffeMachine, microwave, mug, spoon, washingMachine, bowl, knife
		Kitchen kitchen = new Kitchen(1, 1, 1, 1, 25, 20, 1, 20, 15);
		// alaramClock, bed, bedSideChest, carpet, hairDrayer, lamp, pillow
		BedRoom bedRoom = new BedRoom(1, 1, 2, 2, 2, 2, 2);
		// bath, toilet, comb, towel, toothBrush, shower, toiletPaper, sink
		Bathroom bathroom = new Bathroom(1, 1, 1, 1, 5, 1, 1, 2);
		
		House myHouse = new House(livingRoom, bedRoom, kitchen, bathroom);
		myHouse.getKitchen().cook("Pizza");
		myHouse.sleep();
	}

}
