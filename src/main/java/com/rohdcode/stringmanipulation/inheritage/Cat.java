package com.rohdcode.stringmanipulation.inheritage;

public class Cat extends Mammal {
	
	boolean longHair;
	public float weight = 0.3F;
	
	public void purr() {
		breathe();
		System.out.println("breath");
		float weight = 0.4F;
		System.out.println("weight: " + weight);
	}

}
