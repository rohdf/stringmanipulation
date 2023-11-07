package com.rohdcode.stringmanipulation.inheritage;

public class Mammal extends Animal {
	
	public float weight = 0.2F;
	int heartRate;
	
	void breathe() {
		eat();
		System.out.println("breathe");
	}

}
